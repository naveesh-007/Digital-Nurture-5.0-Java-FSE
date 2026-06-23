-- Create Table
CREATE TABLE Customers_Discount (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    InterestRate NUMBER
);

-- Insert Data
INSERT INTO Customers_Discount VALUES (201, 'Ravi', 68, 8);
INSERT INTO Customers_Discount VALUES (202, 'Priya', 45, 7);
INSERT INTO Customers_Discount VALUES (203, 'Arjun', 72, 9);
INSERT INTO Customers_Discount VALUES (204, 'Neha', 58, 6);
INSERT INTO Customers_Discount VALUES (205, 'Vikram', 64, 7);

COMMIT;

SET SERVEROUTPUT ON;

DECLARE
BEGIN
    FOR cust_rec IN (
        SELECT CustomerID, Age, InterestRate
        FROM Customers_Discount
    )
    LOOP
        IF cust_rec.Age > 60 THEN

            UPDATE Customers_Discount
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'CustomerID: ' || cust_rec.CustomerID ||
                ' | Discount Applied'
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/