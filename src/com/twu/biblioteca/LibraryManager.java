package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LibraryManager {


    private static final String UNAVAILABLE_MSG = "That item is not available.";
    private static final String INVALID_RETURN_MSG = "That is not a valid item to return";

    List<Object> checkedOutItems = new ArrayList<Object>();

    public Object checkOutItem(ArrayList categoryList, Object itemToCheckOut, User user) {
        for (Object categoryItem : categoryList) {
            if (categoryItem.equals(itemToCheckOut)) {
                checkedOutItems.add(itemToCheckOut);
                user.addToBorrowedItems(itemToCheckOut);
//                System.out.println("You've successfully checked out" + itemToCheckOut);
                return itemToCheckOut;
            }
        }
        return UNAVAILABLE_MSG;
    }

    public Object returnBook(Object itemToReturn) {
        for (Object item : checkedOutItems) {
            if (item.equals(itemToReturn)) {
                return itemToReturn;
            }
        }
//        for (Map.Entry<Object, User> item : checkedOutItems.entrySet()) {
//            if (item.getKey().equals(itemToReturn)) {
//                return itemToReturn;
//            }
//        }
        return INVALID_RETURN_MSG;
    }

}
