Serverless Framework + AWS + Javaはハマりどころを解消したサンプルプロジェクト.

# 使い方
リクエストボディを評価する必要がない場合（主にGETメソッド）、RequestHandler<Void, レスポンスの型>インターフェイスを実装するクラスを作る.

リクエストボディを評価したい場合（POSTやPUT）、BodyHandlerクラスを継承したクラスを作る.
