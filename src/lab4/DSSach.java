import java.util.ArrayList;

class DSSach {
    private ArrayList<Sach> danhSachSach;

    public DSSach() {
        danhSachSach = new ArrayList<>();
    }

    // Phương thức thêm sách vào danh sách
    public boolean themSach(Sach sach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equals(sach.getMaSach())) {
                return false; // Không thêm nếu mã sách đã tồn tại
            }
        }
        danhSachSach.add(sach);
        return true; // Thêm sách thành công
    }

    // Phương thức lấy thông tin sách tại vị trí i trong danh sách
    public Sach layThongTinSach(int index) {
        if (index >= 0 && index < danhSachSach.size()) {
            return danhSachSach.get(index);
        }
        return null; // Trả về null nếu index không hợp lệ
    }

    // Phương thức xóa một sách ra khỏi danh sách khi biết mã sách
    public boolean xoaSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                danhSachSach.remove(sach);
                return true; // Xóa sách thành công
            }
        }
        return false; // Không tìm thấy sách để xóa
    }

    // Phương thức tìm sách theo mã sách và hiển thị thông tin sách
    public Sach timSachTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                return sach;
            }
        }
        return null; // Trả về null nếu không tìm thấy sách
    }

    // Phương thức cập nhật thông tin cho sách khi biết mã sách
    public boolean capNhatThongTinSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            Sach sach = danhSachSach.get(i);
            if (sach.getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                return true; // Cập nhật thành công
            }
        }
        return false; // Không tìm thấy sách để cập nhật
    }

    // Phương thức trả về tổng số sách có trong danh sách
    public int tongSoSach() {
        return danhSachSach.size();
    }
}