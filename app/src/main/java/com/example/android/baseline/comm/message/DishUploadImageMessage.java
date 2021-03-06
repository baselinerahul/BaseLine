package com.example.android.baseline.comm.message;//package com.abhi.rinkusharma.baseline.user.comm.message;
//
//import android.content.Context;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import cam.gobble.palo3.gobbleup.comm.ObjectCaster;
//
//import cam.gobble.palo3.gobbleup.pojo.MessagePOJO;
//import cam.gobble.palo3.gobbleup.pojo.UserPOJO;
//import cam.gobble.palo3.gobbleup.utils.FileUtility;
//
///**
// * Created by Palo12 on 10-05-2017.
// */
//public class DishUploadImageMessage extends ImageMessage {
//
//    public DishUploadImageMessage(Context context, UserPOJO userPOJO) {
//        super(context, userPOJO);
//    }
//
//    @Override
//    protected void onPostExecute(Object result) {
//        super.onPostExecute(result);
//        System.out.println("DishUploadImageMessage.onPostExecute()" + result);
//        MessagePOJO messagePOJO = ObjectCaster.jSONcast(MessagePOJO.class, (String) result);
//        HashMap<String, String> imageList = messagePOJO.getImageList();
//        for (Map.Entry entry : imageList.entrySet()) {
//            String imageName = (String) entry.getKey();
//            String imageSource = (String) entry.getValue();
//            try {
//                FileUtility.storeImage(getUserPOJO().getId(), imageSource, imageName);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}