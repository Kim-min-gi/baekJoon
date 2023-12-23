SELECT      A.APNT_NO
        ,   B.PT_NAME
        ,   A.PT_NO
        ,   A.MCDP_CD
        ,   C.DR_NAME
        ,   A.APNT_YMD
FROM        APPOINTMENT A
        ,   PATIENT     B
        ,   DOCTOR      C
WHERE       1=1
            AND A.PT_NO = B.PT_NO
            AND A.MDDR_ID = C.DR_ID
            AND TO_CHAR(A.APNT_YMD,'YYYYMMDD') = '20220413'
            AND A.MCDP_CD = 'CS'
            AND A.APNT_CNCL_YN = 'N'
ORDER BY    A.APNT_YMD