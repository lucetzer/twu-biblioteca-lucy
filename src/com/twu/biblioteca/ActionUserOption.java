//package com.twu.biblioteca;
//
//public enum ActionUserOption {
//
//    BOOKLIST(1),
//    CHECKOUT(2),
//    RETURN(3),
//    QUIT(4);
//
//        int item;
//    MainMenu menu;
//
//
//    public static ActionUserOption getOption(int selectedOption, MainMenu menu, User user) {
//        this.menu = menu;
//        User newUser = user;
//        for(ActionUserOption option : values()) {
//            if (selectedOption == option.item) {
//                return selectedOption;
//            } else {
//                System.out.print("Select a valid option!");
//            }
//        }
//    }
//
//
//    BOOKLIST {
//        public void go() {
//            menu.printBookList();
//            prompt(menu);
//        }
//    },
//    CHECKOUT {
//        public void go() {
//            getCheckOutBookFromUser(user, menu);
//            prompt(menu);
//        }
//    },
//    RETURN {
//        public void go() {
//            getReturnBookFromUser(user, menu);
//            prompt(menu);
//        }
//    },
//    QUIT {
//        public void go() {
//            System.out.print("Goodbye!");
//        }
//    };
//
//
//}


//public enum menuOptions {
//    BOOKLIST(1), CHECKOUT(2), RETURN(3), QUIT(4);
//
//    int item;
//    //        MainMenu menu;
////        User user;
////
//    public static menuOptions getOption(int selectedOption, MainMenu menu, User user) {
//        for(menuOptions option : values()) {
//            if (selectedOption == option.item) {
//                selectFromMenu(menu, selectedOption, user);
//            } else {
//                System.out.print("Select a valid option!");
//            }
//        }
//    }

//        BOOKLIST {
//            public void go() {
//                menu.printBookList();
//                prompt(menu);
//            }
//        },
//        CHECKOUT {
//            public void go() {
//                getCheckOutBookFromUser(user, menu);
//                prompt(menu);
//            }
//        },
//        RETURN {
//            public void go() {
//                getReturnBookFromUser(user, menu);
//                prompt(menu);
//            }
//        },
//        QUIT {
//            public void go() {
//                System.out.print("Goodbye!");
//            }
//        };


//}
