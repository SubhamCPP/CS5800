package org.example;

import java.util.Iterator;
import java.util.List;

public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        // Creating 4 users and adding them to system
        User projectLead = new User("Subham Panda", chatServer);
        User backendDev = new User("Amrit Nandan", chatServer);
        User frontendDev = new User("Rajat Pattnaik", chatServer);
        User qaEngineer = new User("Animish Choudhury", chatServer);

        System.out.println("\n===== Team Members Created =====");

        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(projectLead, List.of(backendDev), "Amrit, could you update the status of the backend API integration?"));
        chatServer.sendMessage(new Message(qaEngineer, List.of(backendDev), "Amrit, have you fixed the bugs I reported yesterday?"));
        chatServer.sendMessage(new Message(backendDev, List.of(qaEngineer), "Hey Animish, I've addressed the critical bugs. Please verify on your end."));
        chatServer.sendMessage(new Message(qaEngineer, List.of(projectLead), "Subham, the test results look promising. We should discuss the next steps."));
        chatServer.sendMessage(new Message(projectLead, List.of(frontendDev), "Rajat, do we need additional resources for the UI/UX phase?"));
        chatServer.sendMessage(new Message(projectLead, List.of(qaEngineer), "Animish, can you prioritize the load testing for tomorrow?"));
        chatServer.sendMessage(new Message(frontendDev, List.of(projectLead), "Hello, Subham, I think we're on track. However, I'll need the final assets by Friday."));
        System.out.println("----------------------------------");

        System.out.println("\n===== Demonstrating block function =====");
        backendDev.blockerUsers(projectLead);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(projectLead, List.of(backendDev, frontendDev), "Please check your emails for the updated project timeline."));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(frontendDev, List.of(projectLead), "Subham, could we discuss the timeline adjustment in tomorrow's meeting?"));
        System.out.println("----------------------------------");

        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Rajat Pattnaik unsent last message");
        chatServer.undoLastMessage(frontendDev);
        System.out.printf("Now, Rajat Pattnaik's last message is '%s'\n", frontendDev.getChatHistory().getLastSentMessages());
        System.out.println("----------------------------------");

        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Amrit Nandan unsent last message:");
        chatServer.undoLastMessage(backendDev);
        System.out.println("----------------------------------");
        // Iterating over all messages in user3's chat history
        System.out.println("Iterating over all messages in Rajat Pattnaik's chat history:");
        Iterator<Message> allMessagesIterator = frontendDev.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.println("------------------------------------\n");
        // Iterating over all messages in user1's chat history
        System.out.println("Iterating over all messages in Subham Panda's chat history:");
        allMessagesIterator = projectLead.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.println("------------------------------------\n");
        // Iterating over all messages in user4's chat history
        System.out.println("Iterating over all messages in Animish Choudhury's chat history:");
        allMessagesIterator = qaEngineer.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.println("------------------------------------\n");

        System.out.println("\n===== Demonstrating unregister function =====");
        chatServer.unregisterUser(qaEngineer);
        chatServer.sendMessage(new Message(projectLead, List.of(qaEngineer), "Lets catch up!"));
        System.out.println("------------------------------------\n");
    }
}
