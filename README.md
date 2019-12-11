Bài tập dependency injection:
- Có các class mô phỏng lại hoạt động của 1 ATM: rút tiền, gửi tiền, hiển thị thông tin
- Bài tập:
  + Số tiền khởi tạo của ATM được thiết lập ở file application.yml
  + Cho phép khởi tạo 1 customer từ thông tin nhập vào màn hình console (Hiển thị màn hình nhập số tài khoản, mã pin, số tiền khởi tạo)
  + Refactor code, chuyển class BidvAtm, PrinterConsole sang sử dụng Dependency Injection: 
  + Tạo 1 class PrinterFile khác để thay thế cho PrinterConsole: ghi log message ra file