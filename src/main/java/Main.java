import Bot.MyBot;
import DataBase.Database;
import lombok.SneakyThrows;
import model.TgUser;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            try {
                telegramBotsApi.registerBot(new MyBot());
            } catch (TelegramApiRequestException e) {
                e.printStackTrace();
            }
        Database.tgUserList.add(new TgUser("1302908674","Genuine04","Azizbek Komilov","+998996280240",true));
        }

}
