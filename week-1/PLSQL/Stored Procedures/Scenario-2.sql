CREATE TABLE Employees_Bonus (
    EmpID NUMBER PRIMARY KEY,
    EmpName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(10,2)
);

INSERT INTO Employees_Bonus VALUES (201, 'Rahul', 'HR', 35000);
INSERT INTO Employees_Bonus VALUES (202, 'Sneha', 'HR', 40000);
INSERT INTO Employees_Bonus VALUES (203, 'Karthik', 'IT', 50000);
INSERT INTO Employees_Bonus VALUES (204, 'Meera', 'IT', 55000);

COMMIT;

SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_pct IN NUMBER
)
IS
    v_count NUMBER;
BEGIN
    UPDATE Employees_Bonus
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_department;

    v_count := SQL%ROWCOUNT;

    DBMS_OUTPUT.PUT_LINE(
        'Bonus applied to ' || v_count ||
        ' employee(s) in ' || p_department ||
        ' department.'
    );

    COMMIT;
END;
/

BEGIN
    UpdateEmployeeBonus('HR', 15);
END;
/