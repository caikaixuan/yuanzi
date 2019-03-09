package com.example.main;

import com.example.entity.Account;
import com.example.entity.AccountThread;

public class Main {
    public static void main(String[] args) throws Exception {
//        String exe = "/Library/Frameworks/Python.framework/Versions/3.6/bin/python3.6";
//        String scriptPath = " /Users/kaixuan/Desktop/FineCode/dehaze.py";
//        String inputFile = " --inputFile /Users/kaixuan/Desktop/FineCode/image/input.jpg";
//        String outputFile = " --outputFile /Users/kaixuan/Desktop/FineCode/image/dehaze_output.jpg";
//        String img = " --img /Users/kaixuan/Desktop/FineCode/image/1.jpg /Users/kaixuan/Desktop/FineCode/image/2.jpg /Users/kaixuan/Desktop/FineCode/image/3.jpg";
//        String arguments = exe+scriptPath+inputFile+outputFile;
//        try {
//            Process process = Runtime.getRuntime().exec("/Library/Frameworks/Python.framework/Versions/3.6/bin/python3.6 /Users/kaixuan/Desktop/FineCode/stitching.py  --img /Users/kaixuan/Desktop/FineCode/image/1.jpg /Users/kaixuan/Desktop/FineCode/image/2.jpg /Users/kaixuan/Desktop/FineCode/image/3.jpg  --output output/将imageid拆分出来的第一次测试/图像拼接算2/da07c08d-aeda-44f2-bca9-4e622b507326.jpg");
//            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line = null;
//            while ((line = in.readLine()) != null) {
//                System.out.println(line);
//            }
//            in.close();
//            int re = process.waitFor();
//            System.out.println(re);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ImageResizeUtils.imageResize("/Users/kaixuan/Desktop/FineCode/image/5.jpg","/Users/kaixuan/Desktop/FineCode/image/5-resize-2.jpg",0.5f);
        Account account = new Account(123L,200);
        AccountThread accountThread = new AccountThread();
        accountThread.setAccount(account);
        accountThread.start();
        System.out.println(account.getAccountBalance());


    }
}
//python  /Users/kaixuan/Desktop/FineCode/dehaze.py  --inputFile /Users/kaixuan/Desktop/FineCode/image/input.jpg  --outputFile /Users/kaixuan/Desktop/FineCode/image/dehaze_output.jpg
//python /Users/kaixuan/Desktop/FineCode/stitching.py --img /Users/kaixuan/Desktop/FineCode/image/1.jpg /Users/kaixuan/Desktop/FineCode/image/2.jpg /Users/kaixuan/Desktop/FineCode/image/3.jpg