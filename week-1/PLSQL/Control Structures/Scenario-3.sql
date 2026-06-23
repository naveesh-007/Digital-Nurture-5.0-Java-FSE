-- Create Table
CREATE TABLE Loans_Reminder (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    DueDate DATE
);

-- Insert Data
INSERT INTO Loans_Reminder VALUES (401, 301, SYSDATE + 12);
INSERT INTO Loans_Reminder VALUES (402, 302, SYSDATE + 45);
INSERT INTO Loans_Reminder VALUES (403, 303, SYSDATE + 20);
INSERT INTO Loans_Reminder VALUES (404, 304, SYSDATE + 8);
INSERT INTO Loans_Reminder VALUES (405, 305, SYSDATE + 60);

COMMIT;

SET SERVEROUTPUT ON;

DECLARE
BEGIN
    FOR loan_rec IN (
        SELECT LoanID, CustomerID, DueDate
        FROM Loans_Reminder
        WHERE DueDate BETWEEN SYSDATE
                          AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || loan_rec.LoanID ||
            ' for Customer ' || loan_rec.CustomerID ||
            ' is due on ' ||
            TO_CHAR(loan_rec.DueDate,'DD-MON-YYYY')
        );

    END LOOP;
END;
/