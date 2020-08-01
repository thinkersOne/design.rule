package org.simple.responsebility;

public class Method {

//    V1
//    private void modifyUserInfo(String userName,String address){
//        userName = "Tom";
//        address = "changsha";
//    }
//    优化为：
    private void modifyUserName(String userName){
        userName = "Tom";
    }

    private void modityAddress(String address){
        address = "changsha";
    }

}
