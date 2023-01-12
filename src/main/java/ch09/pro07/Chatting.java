package ch09.pro07;

public class Chatting {
    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
        String nickName = null;
        nickName = chatId;
        String finalNickName = nickName;

        Chat chat = new Chat() {
            @Override
            public void start() {
                String inputData = "안녕하세요";
                String message = "[" + finalNickName + "] " + inputData;
                sendMessage(message);
            }
        };

        chat.start();
    }
}
