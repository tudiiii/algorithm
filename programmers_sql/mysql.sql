-- 모든 레코드 조회하기
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- 역순 정렬하기
SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC;

-- 아픈 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'SICK';
ORDER BY ANIMAL_ID

-- 어린 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged';
ORDER BY ANIMAL_ID

-- 이름이 없는 동물의 아이디
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID;

-- 동물의 아이디와 이름
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- 여러 기준으로 정렬하기
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC, DATETIME DESC;

-- 상위 n개 레코드
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME LIMIT 1;

-- 이름이 있는 동물의 아이디
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;

-- 최댓값 구하기
SELECT MAX(DATETIME) 시간
FROM ANIMAL_INS;

-- 강원도에 위치한 생산공장 목록 출력하기
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID

-- 경기도에 위치한 식품창고 목록 출력하기
SELECT  WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID

-- 나이 정보가 없는 회원 수 구하기
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE IS NULL

-- 조건에 맞는 회원수 구하기
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 AND AGE BETWEEN 20 AND 29

-- 가장 비싼 상품 구하기
SELECT MAX(PRICE) AS MAX_PRICE
FROM PRODUCT

-- 12세 이하인 여자 환자 목록 출력하기
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE GEND_CD ='W' AND AGE <= 12
ORDER BY AGE DESC, PT_NAME ASC

-- 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC

-- 인기있는 아이스크림
SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC

-- 과일로 만든 아이스크림 고르기
SELECT fh.FLAVOR AS FLAVOR
FROM FIRST_HALF fh JOIN ICECREAM_INFO ii ON fh.FLAVOR = ii.FLAVOR 
WHERE fh.TOTAL_ORDER > 3000 AND ii.INGREDIENT_TYPE ='FRUIT_BASED'
ORDER BY fh.TOTAL_ORDER DESC

--최솟값 구하기
SELECT MAX(DATETIME) AS 시간
FROM ANIMAL_INS

--고양이와 개는 몇 마리 있을까
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) count
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE = 'DOG'

--동명 동물 수 찾기
SELECT NAME, COUNT(NAME) AS count
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME) >= 2
ORDER BY NAME

--루시와 엘라 찾기
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy','Ella','Pickle','Rogan','Sabrina','Mitty')

--이름에 el이 들어가는 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE ='Dog' AND UPPER(NAME) LIKE '%EL%'
ORDER BY UPPER(NAME)

--동물수 구하기
SELECT COUNT(ANIMAL_ID) AS count
FROM ANIMAL_INS

--중복 제거하기
SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL

--중성화 여부 파악하기
SELECT ANIMAL_ID, NAME, (CASE WHEN SEX_UPON_INTAKE LIKE 'Neutered%' OR SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O' ELSE 'X' END) AS 중성화
FROM ANIMAL_INS

-- NULL 처리하기
SELECT ANIMAL_TYPE, IFNULL(NAME,'No name') NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS

-- 입양 시각 구하기(1)
SELECT HOUR(DATETIME) AS HOUR, COUNT(DATETIME) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) >= 9 AND HOUR(DATETIME) <=19
GROUP BY HOUR
ORDER BY HOUR

-- DATETIME에서 DATE로 형 변환
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME,'%Y-%m-%d') AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID

-- 가격이 제일 비싼 식품의 정보 출력하기
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
FROM FOOD_PRODUCT 
WHERE PRICE IN (SELECT MAX(PRICE) FROM FOOD_PRODUCT)

SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
FROM FOOD_PRODUCT
ORDER BY PRICE DESC LIMIT 1

-- 3월에 태어난 여성 회원 목록 출력하기
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d')
FROM MEMBER_PROFILE
WHERE MONTH(DATE_OF_BIRTH) = 3 AND GENDER = 'W' AND TLNO IS NOT NULL
ORDER BY MEMBER_ID

-- 카테고리 별 상품 개수 구하기
SELECT SUBSTR(PRODUCT_CODE, 1, 2) AS CATEGORY, COUNT(*) AS COUNT
FROM PRODUCT
GROUP BY CATEGORY
ORDER BY PRODUCT_CODE

-- 가격대 별 상품 개수 구하기
SELECT FLOOR(PRICE/10000) * 10000 AS PRICE_GROUP , COUNT(*) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP

-- 상품 별 오프라인 매출 구하기
SELECT P.PRODUCT_CODE AS PRODUCT_CODE, P.PRICE * SUM(O.SALES_AMOUNT) AS SALES
FROM PRODUCT P JOIN OFFLINE_SALE O ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC,  PRODUCT_CODE

-- 재구매가 일어난 상품과 회원 리스트 구하기
SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(*) > 1
ORDER BY USER_ID, PRODUCT_ID DESC

-- 진료과별 총 예약 횟수 출력하기
SELECT MCDP_CD AS '진료과코드', COUNT(DISTINCT(PT_NO)) AS '5월예약건수'
FROM APPOINTMENT
WHERE YEAR(APNT_YMD) = 2022 AND MONTH(APNT_YMD) = 5
GROUP BY MCDP_CD
ORDER BY 2, 1

-- 성분으로 구분한 아이스크림 총 주문량
SELECT I.INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF F JOIN ICECREAM_INFO I ON F.FLAVOR = I.FLAVOR
GROUP BY I.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER

-- 조건에 맞는 도서와 저자 리스트 출력하기
SELECT B.BOOK_ID AS BOOK_ID, A.AUTHOR_NAME AS AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK B JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE

-- 없어진 기록 찾기
SELECT O.ANIMAL_ID AS ANIMAL_ID, O.NAME AS NAME
FROM ANIMAL_INS I RIGHT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL

-- 있었는데요 없었습니다
SELECT O.ANIMAL_ID AS ANIMAL_ID, O.NAME AS NAME
FROM ANIMAL_INS I RIGHT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.DATETIME > O.DATETIME
ORDER BY I.DATETIME

-- 오랜 기간 보호한 동물(1)
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS I LEFT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.DATETIME IS NULL
ORDER BY I.DATETIME
LIMIT 3

-- 오랜 기간 보호한 동물(2)
SELECT I.ANIMAL_ID AS ANIMAL_ID, I.NAME AS NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY DATEDIFF(I.DATETIME, O.DATETIME)
LIMIT 2

-- 헤비 유저가 소유한 장소
SELECT ID, NAME, HOST_ID
FROM PLACES
WHERE HOST_ID IN ( SELECT HOST_ID FROM PLACES GROUP BY HOST_ID HAVING COUNT(*) >= 2)
ORDER BY ID

-- 조건별로 분류하여 주문상태 출력하기
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE, 
CASE
    WHEN OUT_DATE IS NULL THEN '출고미정'
    WHEN OUT_DATE < '2022-05-02' THEN '출고완료'
    ELSE '출고대기'
    END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID

-- 즐겨찾기가 가장 많은 식당 정보 출력하기
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO
WHERE (FOOD_TYPE, FAVORITES) IN
      (SELECT FOOD_TYPE, MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE)
ORDER BY 1 DESC

-- 카테고리 별 도서 판매량 집계하기
SELECT B.CATEGORY AS CATEGORY, SUM(BS.SALES) AS TOTAL_SALES
FROM BOOK B LEFT JOIN BOOK_SALES BS ON B.BOOK_ID = BS.BOOK_ID
WHERE DATE_FORMAT(BS.SALES_DATE, "%Y-%m") = "2022-01"
GROUP BY 1
ORDER BY 1

-- 대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기
SELECT MONTH(START_DATE) AS MONTH, C.CAR_ID AS CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY C
         INNER JOIN (
    SELECT CAR_ID, COUNT(*) AS COUNT
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN "2022-08-01" AND "2022-10-31"
    GROUP BY 1
) X ON X.CAR_ID = C.CAR_ID
WHERE X.COUNT >= 5 AND (START_DATE BETWEEN "2022-08-01" AND "2022-10-31")
GROUP BY 1, 2
HAVING COUNT(*) > 0
ORDER BY 1, 2 DESC

-- 보호소에서 중성화한 동물
SELECT B.ANIMAL_ID AS ANIMAL_ID, B.ANIMAL_TYPE AS ANIMAL_TYPE, B.NAME AS NAME
FROM (SELECT *
      FROM ANIMAL_INS
      WHERE SEX_UPON_INTAKE LIKE '%INTACT%') A, ANIMAL_OUTS B
WHERE A.ANIMAL_ID = B.ANIMAL_ID AND B.SEX_UPON_OUTCOME NOT LIKE '%INTACT%'
ORDER BY 1 ASC

-- 입양 시각 구하기(2)
SET @hour = -1;
SELECT @hour := @hour + 1  AS HOUR, (
    SELECT COUNT(DATETIME)
    FROM ANIMAL_OUTS B
    WHERE HOUR(DATETIME) = @hour
) AS COUNT
FROM ANIMAL_OUTS A
WHERE @hour < 23

-- 우유와 요거트가 담긴 장바구니
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME IN ( 'Yogurt', 'Milk' )
GROUP BY CART_ID
HAVING COUNT(DISTINCT NAME) = 2

-- 식품분류별 가장 비싼 식품의 정보 조회하기
SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (CATEGORY, PRICE) IN ( SELECT CATEGORY, MAX(PRICE)
                             FROM FOOD_PRODUCT
                             WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
                             GROUP BY CATEGORY)
ORDER BY PRICE DESC