package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {


    private static final String UNAVAILABLE_MSG = "That item is not available.";
    private static final String INVALID_RETURN_MSG = "That is not a valid item to return";

    List<Object> checkedOutItems = new ArrayList<Object>();

    public Object checkOutItem(ArrayList categoryList, Object itemToCheckOut, User user) {
        for (Object categoryItem : categoryList) {
            if (categoryItem.equals(itemToCheckOut)) {
                checkedOutItems.add(itemToCheckOut);
                user.addToBorrowedItems(itemToCheckOut);
                System.out.println("You've successfully checked out" + itemToCheckOut);
                return itemToCheckOut;
            }
        }
        return UNAVAILABLE_MSG;
    }

    public Object returnItem(Object itemToReturn) {
        for (Object item : checkedOutItems) {
            if (item.equals(itemToReturn)) {
                return itemToReturn;
            }
        }
        return INVALID_RETURN_MSG;
    }

}
