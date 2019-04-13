/**
 * 
 */
    /**
     * エンドポイントへの接続処理
     */
    function connection() {
        var socket = new WebSocket('ws://' + location.host + '/chat/hello'); // エンドポイントのURL
        this.stompClient = Stomp.over(socket); // WebSocketを使ったStompクライアントを作成
        this.stompClient.connect({}, function (frame) {
        	stompClient.subscribe('/topic/greetings',function (message) {
                var response = document.getElementById('response');
                var p = document.createElement('p');
                p.textContent = message;
                p.appendChild(document.createTextNode(message.body));
                response.insertBefore(p, response.children[0]);
        	});
        }); // エンドポイントに接続し、接続した際のコールバックを登録
    };



/*
function setConnected(connected) {
	document.getElementById('connection').disabled = connected;
}


function connection() {
	var endpoint = 'http://' + location.host + '/chat/hello';
	var socket = new SockJS(endpoint);
	stompClient = Stomp.over(socket);
	console.log('stompClient:' + socket);
	console.log('endpoint:' + endpoint);
            stompClient.connect({}, function (frame) {
                setConnected(true);
                console.log('Connected: ' + frame);
                stompClient.subscribe('/topic/greetings', function (greeting) { // 挨拶の応答(/topic/greetings)を購読する
                    showGreeting(JSON.parse(greeting.body).content);
                });
            });
}
*/

function send() {
	var name = document.getElementById('textinput').value;
    stompClient.send("/chat/hello", {}, JSON.stringify({'send': name})); // メッセージを送信
}
/*
function showGreeting(message) {
    var response = document.getElementById('response');
    var p = document.createElement('p');
    p.style.wordWrap = 'break-word';
    p.appendChild(document.createTextNode(message));
    response.appendChild(p);
}*/