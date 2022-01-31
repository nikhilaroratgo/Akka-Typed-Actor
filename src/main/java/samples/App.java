package samples;

import akka.actor.typed.ActorSystem;
import samples.HelloWorldMain.SayHello;

public class App {

    public static void main(String[] args) {

        final ActorSystem<SayHello> system =
                ActorSystem.create(HelloWorldMain.create(), "hello");

        system.tell(new SayHello("World"));
        system.tell(new SayHello("Akka1"));
        system.tell(new SayHello("Akka2"));
    }
}
