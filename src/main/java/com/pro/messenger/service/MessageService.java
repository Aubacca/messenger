package com.pro.messenger.service;

import com.pro.messenger.DatabaseMock;
import com.pro.messenger.model.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created on 29.12.2015.
 */
public class MessageService {
    private static Map<Long, Message> messages = DatabaseMock.getMessages();

    public MessageService() {
        addMessage(new Message(1, "eu tempor erat", "Branden"));
        addMessage(new Message(2, "dolor quam, elementum at, egestas a, ", "Lesley"));
        addMessage(new Message(3, "turpis. Nulla aliquet. Proin velit. Sed", "Julie"));
        addMessage(new Message(4, "nec orci. Donec nibh.", "Leonard"));
        addMessage(new Message(5, "hymenaeos. Mauris", "Glenna"));
        addMessage(new Message(6, "Vivamus sit amet risus. Donec", "Naomi"));
        addMessage(new Message(7, "adipiscing fringilla, porttitor vulputate, posuere", "Isaac"));
        addMessage(new Message(8, "nulla. Integer", "Holmes"));
        addMessage(new Message(9, "nunc. Quisque ornare", "Ronan"));
        addMessage(new Message(10, "cursus, ", "Gretchen"));
        addMessage(new Message(11, "dui quis", "Hyatt"));
        addMessage(new Message(12, "enim, gravida sit amet, dapibus", "Valentine"));
        addMessage(new Message(13, "justo sit amet", "Colette"));
        addMessage(new Message(14, "luctus", "Carol"));
        addMessage(new Message(15, "quis diam luctus lobortis. Class", "Uriel"));
        addMessage(new Message(16, "convallis dolor.", "Illiana"));
        addMessage(new Message(17, "facilisis facilisis, ", "Azalia"));
        addMessage(new Message(18, "ornare, lectus ante dictum mi, ac", "Lysandra"));
        addMessage(new Message(19, "massa rutrum magna. Cras convallis", "Imogene"));
        addMessage(new Message(20, "ante. Maecenas mi", "Brent"));
        addMessage(new Message(21, "faucibus. Morbi", "September"));
        addMessage(new Message(22, "lorem semper", "Quyn"));
        addMessage(new Message(23, "non, feugiat nec, ", "Damian"));
        addMessage(new Message(24, "Nullam lobortis quam a felis ullamcorper", "Britanney"));
        addMessage(new Message(25, "Duis elementum, ", "Aristotle"));
        addMessage(new Message(26, "amet risus. Donec", "Dennis"));
        addMessage(new Message(27, "in", "Donna"));
        addMessage(new Message(28, "magnis dis parturient montes, ", "Cadman"));
        addMessage(new Message(29, "leo. Vivamus", "Brittany"));
        addMessage(new Message(30, "arcu iaculis enim, sit", "Russell"));
        addMessage(new Message(31, "ac urna. Ut tincidunt", "Eden"));
        addMessage(new Message(32, "blandit enim consequat purus. Maecenas libero", "Irma"));
        addMessage(new Message(33, "convallis", "Rowan"));
        addMessage(new Message(34, "elit, pretium et, rutrum non, hendrerit", "Cole"));
        addMessage(new Message(35, "bibendum. Donec felis orci, adipiscing", "Germane"));
        addMessage(new Message(36, "neque et nunc. Quisque ornare", "Griffin"));
        addMessage(new Message(37, "Suspendisse sagittis. Nullam vitae diam.", "Buffy"));
        addMessage(new Message(38, "ac, feugiat non, ", "Hollee"));
        addMessage(new Message(39, "posuere vulputate, ", "Jeanette"));
        addMessage(new Message(40, "Proin non massa non", "Neville"));
        addMessage(new Message(41, "habitant morbi tristique senectus et netus", "Tyrone"));
        addMessage(new Message(42, "eu elit. Nulla facilisi.", "Autumn"));
        addMessage(new Message(43, "sed pede. Cum sociis natoque", "Libby"));
        addMessage(new Message(44, "consectetuer euismod est arcu ac orci.", "Hamish"));
        addMessage(new Message(45, "Praesent luctus.", "Ezra"));
        addMessage(new Message(46, "convallis dolor. Quisque", "Indigo"));
        addMessage(new Message(47, "Aliquam tincidunt, nunc ac mattis ornare, ", "Ivor"));
        addMessage(new Message(48, "quis, pede. Praesent eu", "Claire"));
        addMessage(new Message(49, "Pellentesque", "Samson"));
        addMessage(new Message(50, "sapien. Aenean massa. Integer vitae nibh.", "Channing"));
        addMessage(new Message(51, "consequat, ", "Merrill"));
        addMessage(new Message(52, "aliquam iaculis, lacus pede", "Melanie"));
        addMessage(new Message(53, "a mi fringilla", "Price"));
        addMessage(new Message(54, "Duis cursus, diam at pretium aliquet, ", "Vivian"));
        addMessage(new Message(55, "placerat eget, ", "Haviva"));
        addMessage(new Message(56, "tristique aliquet. Phasellus fermentum", "Dai"));
        addMessage(new Message(57, "Donec", "Regina"));
        addMessage(new Message(58, "Suspendisse aliquet, sem", "Alisa"));
        addMessage(new Message(59, "penatibus et magnis dis parturient montes, ", "Colin"));
        addMessage(new Message(60, "leo, in", "Cassidy"));
        addMessage(new Message(61, "nec tellus.", "Britanney"));
        addMessage(new Message(62, "Fusce mi lorem, vehicula et, ", "Benjamin"));
        addMessage(new Message(63, "placerat. Cras", "Ashton"));
        addMessage(new Message(64, "Donec luctus aliquet", "Yuli"));
        addMessage(new Message(65, "est. Mauris eu", "Rahim"));
        addMessage(new Message(66, "dictum", "Caldwell"));
        addMessage(new Message(67, "sit amet luctus vulputate, nisi", "Gray"));
        addMessage(new Message(68, "risus.", "Martina"));
        addMessage(new Message(69, "Quisque ornare tortor", "Ishmael"));
        addMessage(new Message(70, "lorem semper", "Castor"));
        addMessage(new Message(71, "dapibus", "Joelle"));
        addMessage(new Message(72, "Proin vel nisl.", "Grace"));
        addMessage(new Message(73, "nisi.", "Cadman"));
        addMessage(new Message(74, "netus et malesuada fames ac turpis", "Kitra"));
        addMessage(new Message(75, "fermentum fermentum", "Bertha"));
        addMessage(new Message(76, "Nullam velit dui, ", "Demetrius"));
        addMessage(new Message(77, "risus. Quisque libero", "Zachery"));
        addMessage(new Message(78, "ante. Vivamus non lorem vitae odio", "Dane"));
        addMessage(new Message(79, "metus urna convallis erat, eget tincidunt", "Alea"));
        addMessage(new Message(80, "sit amet, ", "Nigel"));
        addMessage(new Message(81, "ut, pellentesque eget, dictum", "Jesse"));
        addMessage(new Message(82, "Vivamus non lorem vitae", "Castor"));
        addMessage(new Message(83, "ut", "Octavia"));
        addMessage(new Message(84, "arcu ac orci. Ut semper", "Wylie"));
        addMessage(new Message(85, "ipsum dolor sit amet, consectetuer adipiscing", "Mikayla"));
        addMessage(new Message(86, "malesuada vel, ", "Mason"));
        addMessage(new Message(87, "semper, ", "Flavia"));
        addMessage(new Message(88, "egestas. Aliquam", "Todd"));
        addMessage(new Message(89, "neque sed sem egestas", "Ralph"));
        addMessage(new Message(90, "Aliquam ultrices iaculis odio. Nam", "Knox"));
        addMessage(new Message(91, "turpis vitae purus", "Reese"));
        addMessage(new Message(92, "Suspendisse", "Rae"));
        addMessage(new Message(93, "nunc.", "Frances"));
        addMessage(new Message(94, "consequat enim diam", "Macon"));
        addMessage(new Message(95, "pede", "Brynn"));
        addMessage(new Message(96, "arcu. Vestibulum ante ipsum primis", "Xena"));
        addMessage(new Message(97, "eu nibh vulputate mauris", "Jermaine"));
        addMessage(new Message(98, "ante, iaculis nec, eleifend non, ", "Florence"));
        addMessage(new Message(99, "sagittis placerat.", "Garrison"));
        addMessage(new Message(100, "fringilla. Donec feugiat metus sit", "Rama"));
    }

    public List<Message> getMessages() {
        printMessages();
        return new ArrayList<>(messages.values());
    }

    public List<Message> getMessagesPaginated(int fromIndex, int toIndex) {
        ArrayList<Message> list = new ArrayList<>(messages.values());
        if (fromIndex + toIndex > messages.size()) {
            return new ArrayList<>();
        }
        return list.subList(fromIndex, toIndex);
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        if (message.getCreated() == null) {
            message.setCreated(new Date());
        }
        messages.put(message.getId(), message);
        return message;
    }

    private void printMessages() {
        for (Message message: messages.values()) {
            System.out.println(message);
        }
    }

    public Message updateMessage(Message message) {
        System.out.println(message);
        if (message.getId() >= 0) {
            printMessages();
            messages.put(message.getId(), message);
            System.out.println("Message " + message.getId() + " updated!");
            printMessages();
        }
        return message;
    }

    public void removeMessage(long id) {
        printMessages();
        messages.remove(id);
        System.out.println("Message " + id + " removed!");
        printMessages();
    }
}

