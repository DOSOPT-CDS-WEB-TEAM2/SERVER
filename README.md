# ✨ Google Finance

![구글 금융](https://github.com/DOSOPT-CDS-WEB-TEAM2/SERVER/assets/78674565/e097cb08-8b9c-443e-9183-ccdb12354c63)

> 33기 DO SOPT 합동 세미나 Google Finance

<hr>

## 🌸 Contributors 섭팟이들
|                             정준서                             |                               송민규                        |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| <img src="https://user-images.githubusercontent.com/72034311/202870052-6b0a0045-0edf-42b0-8e74-9653589f3e35.png" width="300" height="220"/> | <img src="https://github.com/DOSOPT-CDS-WEB-TEAM2/SERVER/assets/78674565/3a91816a-00c0-4081-80dd-c21963ad538d" width="300" height="300" /> |
|               [sunseo18](https://github.com/sunseo18)               |             [mikekks](https://github.com/mikekks)              |

<hr>

## ⭐️ Role

| 담당 역할                          | Role |
|:-------------------------------|:----:|
| 프로젝트 초기 세팅 후 푸시                | 송민규  |
| 배포                  | 송민규  |
| DB 구축                          | 정준서  |
| ERD 작성                         | 정준서  |

<hr>

## 👻 API Docs

### 🔗 [API Docs](https://www.notion.so/dosopt/c619201760524fc19526a48476524250?v=696b99826bdc41129935eaffb453aa5a&pvs=4)


## ⭐️ API 담당

| 이름                      | 담당 역할                          | Role |
|:------------------------|:-------------------------------|:----:|
| 손익 계산서 조회하기          | [GET] /income_statement/:stockCode    | 정준서  |
| 시장지수 조회하기             | [GET] /stock_index  | 정준서  |
| 종합주가지수 조회하기             | [GET] /stock_index?continent={continent}    | 정준서  |
| 오늘 금융 뉴스 조회하기             | [GET] /news            | 정준서  |
| 주식과 관련된 시장 뉴스 조회하기 | [GET] /news?related=stockCode  | 정준서  |
| 특정 주식의 비교 대상 조회하기  | [GET] /stock?group=groupName | 송민규  |
| 가장 거래가 활발한 주식 조회하기 | [GET] /stock?order=trade_asc    | 송민규  |
| 주식 상세조회하기         | [GET] /stock/:stockCode    | 송민규  |
| 포트폴리오 조회하기 | [GET] /portfolio    | 송민규  |

<hr>

## 👉️ ERD
<img width="732" alt="erd" src="https://github.com/DOSOPT-CDS-WEB-TEAM2/SERVER/assets/78674565/3dcb4fce-4d7b-42d0-855a-90439116264a">

<hr>

## 👉 Project Structure

```
🗂 googleFinance
    🗂 api (api 구현 관련 파일들)
        🗂 controller
            🗂 dto
        🗂 service
    🗂 domain (도메인)
        🗂 entity
        🗂 repository
    🗂 config (설정 파일들)
    🗂 common (프로젝트 전역적으로 활용되는 파일)
        🗂 exception

```

# 🌱 Branch

<aside>

`main branch` : 배포 단위 branch

`develop branch` : 주요 개발 branch, main merge 전 거치는 branch

`feature branch`: 각자 개발 branch

-   구현할 것들 별로 issue 생성
-   issue 번호를 기반으로 branch 생성
    -   ex) feat/#이슈번호
    

-   해당 branch 작업 완료 후 PR 보내기
    -   항상 local에서 충돌 해결 후 → remote에 올리기
    -   reviewer에 서로 tag후 code-review
    -   comment 전 merge 불가!

</aside>

<hr>

# 🙏 Commit Convention

`ex) [Feat] 댓글 작성 API 기능 구현`

```
- [CHORE]: 코드 수정, 내부 파일 수정
- [FEAT] : 새로운 기능 구현
- [ADD] : FEAT 이외의 부수적인 코드 추가, 라이브러리 추가, 새로운 파일 생성 시
- [FIX] : 버그, 오류 해결
- [DEL] : 쓸모없는 코드 삭제
- [DOCS] : README나 WIKI 등의 문서 개정
- [MOVE] : 프로젝트 내 파일이나 코드의 이동
- [RENAME] : 파일 이름의 변경
- [MERGE]: 다른브렌치를 merge하는 경우
- [STYLE] : 코드가 아닌 스타일 변경을 하는 경우
- [REFACTOR] : 로직은 변경 없는 클린 코드를 위한 코드 수정
```

# 🙏 Code Convention

> 💡 **동료들과 말투를 통일하기 위해 컨벤션을 지정합니다.**
> 오합지졸의 코드가 아닌, **한 사람이 짠 것같은 코드**를 작성하는 것이 추후 유지보수나 협업에서 도움이 됩니다. 내가 코드를 생각하면서 짤 수 있도록 해주는 룰이라고 생각해도 좋습니다!

<details>
<summary>명명규칙(Naming Conventions)</summary>
<div markdown="1">

1. 이름으로부터 의도가 읽혀질 수 있게 쓴다.

-   ex)

    ```jsx
    // bad
    function q() {
        // ...stuff...
    }

    // good
    function query() {
        // ..stuff..
    }
    ```

2. 오브젝트, 함수, 그리고 인스턴스에는 `camelCase`를 사용한다.

-   ex)
    ```jsx
    // bad
    const OBJEcttsssss = {};
    const this_is_my_object = {};
    function c() {}

    // good
    const thisIsMyObject = {};
    function thisIsMyFunction() {}
    ```

3. 클래스나 constructor에는 `PascalCase`를 사용한다.

-   ex)
    ```jsx
    // bad
    function user(options) {
        this.name = options.name;
    }

    const bad = new user({
        name: 'nope',
    });

    // good
    class User {
        constructor(options) {
            this.name = options.name;
        }
    }

    const good = new User({
        name: 'yup',
    });
    ```

4. 함수 이름은 동사 + 명사 형태로 작성한다.
   ex) `postUserInformation( )`
5. 약어 사용은 최대한 지양한다.
6. 이름에 네 단어 이상이 들어가면 팀원과 상의를 거친 후 사용한다
 </div>
 </details>

<details>
<summary>블록(Blocks)</summary>
<div markdown="1">

1. 복수행의 블록에는 중괄호({})를 사용한다.

-   ex)
    ```jsx
    // bad
    if (test)
      return false;

    // good
    if (test) return false;

    // good
    if (test) {
      return false;
    }

    // bad
    function() { return false; }

    // good
    function() {
      return false;
    }

    ```

2. 복수행 블록의 `if` 와 `else` 를 이용하는 경우 `else` 는 `if` 블록 끝의 중괄호( } )와 같은 행에 위치시킨다.

-   ex)
    ```java
    // bad
    if (test) {
    thing1();
    thing2();
    }
    else {
    thing3();
    }

    // good
    if (test) {
      thing1();
      thing2();
    } else {
      thing3();
    }

    ```
</div>
</details>

<details>
<summary>코멘트(Comments)</summary>
<div markdown="1">

1. 복수형의 코멘트는 `/** ... */` 를 사용한다.

-   ex)
    ```jsx
    // good
    /**
     * @param {String} tag
     * @return {Element} element
     */
    
    function make(tag) {
        // ...stuff...

        return element;
    }
    ```

2. 단일 행의 코멘트에는 `//` 을 사용하고 코멘트를 추가하고 싶은 코드의 상부에 배치한다. 그리고 코멘트의 앞에 빈 행을 넣는다.

-   ex)
    ```jsx
    // bad
    const active = true; // is current tab

    // good
    // is current tab
    const active = true;

    // good
    function getType() {
        console.log('fetching type...');

        // set the default type to 'no type'
        const type = this._type || 'no type';

        return type;
    }

    ```
</div>
</details>
