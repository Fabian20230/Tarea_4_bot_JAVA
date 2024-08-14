package umg.principaltio;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import umg.principaltio.Bot_tarea.Tareabot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

try{

    TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
    Tareabot a = new Tareabot();
    botApi.registerBot(a);


    System.out.println("PREPARATE!!!!");

    System.out.println("Se esta ejecutando...");


}catch(Exception e){
    System.out.println("error");
    }

    }
}