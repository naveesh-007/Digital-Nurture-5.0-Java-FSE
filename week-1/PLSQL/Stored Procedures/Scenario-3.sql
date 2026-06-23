CREATE TABLE Accounts_Transfer (
    AccountID NUMBER PRIMARY KEY,
    AccountHolderName VARCHAR2(100),
    Balance NUMBER(15,2)
);

INSERT INTO Accounts_Transfer VALUES (301, 'Naveesh', 20000);
INSERT INTO Accounts_Transfer VALUES (302, 'Priya', 10000);
INSERT INTO Accounts_Transfer VALUES (303, 'Arjun', 15000);

COMMIT;

SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_source_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_source_balance
    FROM Accounts_Transfer
    WHERE AccountID = p_source_account;

    IF v_source_balance < p_amount THEN

        DBMS_OUTPUT.PUT_LINE(
            'Transfer failed: Insufficient balance.'
        );

        RETURN;
    END IF;

    UPDATE Accounts_Transfer
    SET Balance = Balance - p_amount
    WHERE AccountID = p_source_account;

    UPDATE Accounts_Transfer
    SET Balance = Balance + p_amount
    WHERE AccountID = p_target_account;

    DBMS_OUTPUT.PUT_LINE(
        'Transferred ₹' || p_amount ||
        ' from Account ' || p_source_account ||
        ' to Account ' || p_target_account
    );

    COMMIT;
END;
/

BEGIN
    TransferFunds(301,302,5000);
END;
/