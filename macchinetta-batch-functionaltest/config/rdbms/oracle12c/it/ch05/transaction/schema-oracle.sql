CREATE TABLE BRANCH_MST (
    BRANCH_ID   VARCHAR2(10) NOT NULL,
    BRANCH_NAME VARCHAR2(50) NOT NULL,
    BRANCH_ADDRESS  VARCHAR2(200) NOT NULL,
    BRANCH_TEL  VARCHAR2(11) NOT NULL,
    CREATE_DATE TIMESTAMP NOT NULL,
    UPDATE_DATE TIMESTAMP ,
    CONSTRAINT PK_BRANCH_MST PRIMARY KEY (BRANCH_ID)
);
