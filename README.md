# 第8回課題

## このプロジェクトについて

このプロジェクトは第8回の課題提出として作成しています。  

Spring boot と MySQL を用いたREAD処理を実装したAPIです。  

## データベース

- 小説のタイトルと作者をデータを入れる`booksテーブル`を作成  
- タイトルは`title`、作者は`author`でカラムを設定

以下の画像はコンソール上での動作確認の結果です。  

![第8回課題動作確認](https://github.com/MasatoKihara25/bookservice/assets/162205053/4cbefe90-ec5f-4c40-a124-9a5529d3566d)

## GETリクエスト

1. `http://localhost:8080/books`で全件取得できるように実装しました。

- 全件取得するために`BookController`を作成
  
![全件取得Controller](https://github.com/MasatoKihara25/bookservice/assets/162205053/5b7e7e6c-0c9f-4681-b3d6-3fdd32bcae9a)


- 全件取得するために`BookMapper`を作成
  
![全件取得Mapper](https://github.com/MasatoKihara25/bookservice/assets/162205053/96eb90d9-f52a-4492-94c9-37b6aae61f8e)


- `Name.java`を作成
  
![Book java](https://github.com/MasatoKihara25/bookservice/assets/162205053/5f1207cf-1da0-47cd-a785-78f95b271163)


- 動作確認  
  
  ステータスコード`200`かつJSON型のデータを取得しました。
  
  ![第8回課題](https://github.com/MasatoKihara25/bookservice/assets/162205053/30e396ed-0c04-42bd-9ab8-d3c629f35ff6)



2. `http://localhost:8080/books?startsWith=〇〇&endsWith=△△&contains=✕✕`のようにクエリ文字列を設定することで複数条件で検索できるように実装しました。

- クエリ文字列用にクラス(`BookSearchRequest.java`)を作成
  
![クラス](https://github.com/MasatoKihara25/bookservice/assets/162205053/614e0485-9d60-47a0-a2ca-b70e00c0bd82)


- `BookController`を修正
  
![Cotroller修正](https://github.com/MasatoKihara25/bookservice/assets/162205053/df3f9efc-132e-4d4b-b019-24a10dad5849)


- `BookMapper`を修正
  
![Mapper修正](https://github.com/MasatoKihara25/bookservice/assets/162205053/bf840169-1069-4aa7-b64c-c5b78069c6f8)


-　動作確認  

ステータスコード`200`かつJSON型のデータを取得しました。  

![第8回課題【複数】](https://github.com/MasatoKihara25/bookservice/assets/162205053/5a6ececb-9f9c-431f-aa81-2b2a6b88ebd4)




