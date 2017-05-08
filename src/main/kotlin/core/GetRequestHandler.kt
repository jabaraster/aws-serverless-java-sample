package core

/**
 * Created by jabaraster.
 * @deprecated GET用にRequestHandlerを作るのは良いアイデアかと思ったが、型引数が２つのinterfaceを実装したクラスしか
 * AWS Lambdaが受け付けてくれないため、断念した.
 */
// interface GetRequestHandler<RES> : RequestHandler<Void, RES>