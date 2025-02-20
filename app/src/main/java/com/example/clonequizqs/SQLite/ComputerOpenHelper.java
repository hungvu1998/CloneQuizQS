package com.example.clonequizqs.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.clonequizqs.Model.ComputerQuestion;

import java.util.ArrayList;
import java.util.List;

public class ComputerOpenHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DB_NAME = "ComputerQuiz";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "Computer";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public ComputerOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public void allQuestion() {
        ArrayList<ComputerQuestion> computerQuestions = new ArrayList<>();

        computerQuestions.add(new ComputerQuestion("Linux là gì?","Hệ điều hành","Phần Mềm","Firmware","Anti-Virus","Hệ điều hành"));

        computerQuestions.add(new ComputerQuestion("Windows ko có phiên bản nào?","8","9","10","7","9"));

        computerQuestions.add(new ComputerQuestion("Người đồng sáng lập Microsoft với Paul Allen là ai?","Steve Jobs","Mark Zuckerberg","Google","Bill Gates","Bill Gates"));

        computerQuestions.add(new ComputerQuestion("1MB = bao nhiêu KB?","1000","1020","1024","2000","1024"));

        computerQuestions.add(new ComputerQuestion("Người đồng sáng lập Google với Sergery Bin là ai?","Larry Page","Steve Jobs","Jack Ma","Bill Gates","Larry Page"));

        computerQuestions.add(new ComputerQuestion("Facebook là gì?","Trò chơi","Mạng xã hội","Website tin tức","Web quảng cáo","Mạng xã hội"));

        computerQuestions.add(new ComputerQuestion("Steve Jobs và Steve Wozniak tạo ra chiếc máy tính đầu tiên của họ bằng một chiếc hộp gỗ. Công ty của họ đã phát triển và vẫn còn hoạt động cho đến ngày hôm nay. Tên của công ty là","Microsoft","Linux","Apple","Windows","Apple"));

        computerQuestions.add(new ComputerQuestion("Điều nào sau đây KHÔNG phải là một chức năng của một máy tính?","Tiếp nhận thông tin","Xử lý thông tin","Suy nghĩ như con người","Cung cấp thông tin","Suy nghĩ như con người"));

        computerQuestions.add(new ComputerQuestion("Việc làm cho cửa sổ đang mở trở thành một nút trên thanh tác vụ được gọi là gì?","Phóng to","Làm sập","Thu nhỏ","Khôi phục","Thu nhỏ"));

        computerQuestions.add(new ComputerQuestion("RAM là gì?","Review Admittance Monitor","Review Admittance Memory","Random Access Memory","Random Access Monitor","Random Access Memory"));

        computerQuestions.add(new ComputerQuestion("Mở tab ẩn danh trên trình duyệt web ấn tổ hợp phím nào?","Alt F4","Ctrl Shift N","Ctrl Alt Del","Ctrl C","Ctrl Shift N"));

        computerQuestions.add(new ComputerQuestion("Chiếc máy tính đầu tiên ra đời năm bao nhiêu","1960","1943","1997","1950","1943"));

        computerQuestions.add(new ComputerQuestion("Tổ hợp phím Ctrl X là để làm gì?","Copy","Paste","Delete","Cut","Cut"));

        computerQuestions.add(new ComputerQuestion("Ai là cha đẻ của Facebook?","Bill Gates","Steve Jobs","Mark Zuckerberg","NASA","Mark Zuckerberg"));

        computerQuestions.add(new ComputerQuestion("Thiết bị nào sau đây dùng để kết nối mạng?","Ram","Rom","Router","CPU","Router"));

        computerQuestions.add(new ComputerQuestion("Công dụng của phím Print Screen là gì?","Chụp màn hình","In màn hình ra máy in","Reset máy","Làm đỡ lag máy","Chụp màn hình"));

        computerQuestions.add(new ComputerQuestion("Trong Microsoft Word, Ctrl S để làm gì?","Save","Copy","Bôi Đen","Open","Save"));

        computerQuestions.add(new ComputerQuestion("Website Yahoo.com hoặc gmail.com cho phép người sử dụng thực hiện gì","Nhận thư","Gửi thư","Tạo hộp thư","Cả 3 phương án","Cả 3 phương án"));

        computerQuestions.add(new ComputerQuestion("Phần mềm nào sau đây không phải trình duyệt WEB?","IE","Firefox","Chrome","Unikey","Unikey"));

        computerQuestions.add(new ComputerQuestion("Dịch vụ lưu trữ đám mây của Microsoft là gì?","GG Drive","Mediafire","OneDrive","Cả 3 phương án","Cả 3 phương án"));

        computerQuestions.add(new ComputerQuestion("Thành phần quan trọng nhất của máy tính số là gì?","Bộ nhớ trong","Bộ nhớ ngoài","CPU","Thiết bị ra vào","CPU"));

        computerQuestions.add(new ComputerQuestion("Máy tính ko thể chạy được các chương trình khi không có?","Bàn phím","Chuột","Loa","Bộ nhớ","Bộ nhớ"));

        computerQuestions.add(new ComputerQuestion("VPN là gì?","Virtual Private Network","Vietnam Private Network","Virutal Pirate Networking","VIP Private Networking","Virtual Private Network"));

        computerQuestions.add(new ComputerQuestion("Câu lệnh dxdiag trong run dùng để?","Xem thông số máy tính","Check Email","Chơi game","Sleep","Xem thông số máy tính"));

        computerQuestions.add(new ComputerQuestion("Youtube là trang web gì?","Game","Tìm Kiếm","Giải đố","Xem Video","Xem Video"));

        this.addAllQuestions(computerQuestions);
    }
    public void addAllQuestions(ArrayList<ComputerQuestion> allQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for (ComputerQuestion question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOptionA());
                values.put(OPTB, question.getOptionB());
                values.put(OPTC, question.getOptionC());
                values.put(OPTD, question.getOptionD());
                values.put(ANSWER, question.getAnswer());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }
    public List<ComputerQuestion> getAllOfTheQuestions() {

        List<ComputerQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


        while (cursor.moveToNext()) {
            ComputerQuestion question = new ComputerQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptionA(cursor.getString(2));
            question.setOptionB(cursor.getString(3));
            question.setOptionC(cursor.getString(4));
            question.setOptionD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }
}
