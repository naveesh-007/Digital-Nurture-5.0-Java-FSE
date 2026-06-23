-- Create Table
CREATE TABLE Customers_VIP (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

-- Insert Data
INSERT INTO Customers_VIP VALUES (301, 'Ananya', 15000, NULL);
INSERT INTO Customers_VIP VALUES (302, 'Rohit', 8000, NULL);
INSERT INTO Customers_VIP VALUES (303, 'Sneha', 22000, NULL);
INSERT INTO Customers_VIP VALUES (304, 'Kiran', 9500, NULL);
INSERT INTO Customers_VIP VALUES (305, 'Meera', 18000, NULL);

COMMIT;

SET SERVEROUTPUT ON;

DECLARE
BEGIN
    FOR cust_rec IN (
        SELECT CustomerID, Balance
        FROM Customers_VIP
    )
    LOOP
        IF cust_rec.Balance > 10000 THEN

            UPDATE Customers_VIP
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'CustomerID: ' || cust_rec.CustomerID ||
                ' promoted to VIP'
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/