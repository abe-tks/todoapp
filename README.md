# ToDo 管理アプリ

## 概要
タスクの追加、削除、完了チェックが可能
Bootstrap を使って見た目を整えています
現時点では永続化機能は未実装（後で H2 データベース追加予定）

## 主な機能
- タスクの追加
- タスクの削除
- 完了チェック

## 開発環境
Java 21.0.7
Spring Boot（埋め込みTomcat使用）
Thymeleaf（HTMLテンプレートエンジン）
Bootstrap 5（CSSフレームワーク）
VS Code（開発環境） 

## 実行方法
1. 本リポジトリをクローン
   ```bash
   git clone https://github.com/abe-tks/todoapp.git
   cd todo-app

VS Code でフォルダを開く
src/main/java/com/example/todoapp/TodoAppApplication.java を右クリック → 「Run Java」
ブラウザで http://localhost:8080/ にアクセス
