package nguyenGiaVi_23676951_CD;


public class CDList {
    private CD[] cds;
    private int count;

    // Constructor khởi tạo với kích thước tối đa
    public CDList(int maxSize) {
        cds = new CD[maxSize];
        count = 0;
    }

    // Thêm một CD vào danh sách
    public boolean themCD(CD cd) {
        if (count >= cds.length) {
            return false; 
        }
        for (int i = 0; i < count; i++) {
            if (cds[i].getMaCD() == cd.getMaCD()) {
                return false; 
            }
        }
        cds[count++] = cd;
        return true;
    }

    // Xóa CD theo mã
    public boolean xoaCD(int maCD) {
        for (int i = 0; i < count; i++) {
            if (cds[i].getMaCD() == maCD) {
                for (int j = i; j < count - 1; j++) {
                    cds[j] = cds[j + 1];
                }
                cds[--count] = null;
                return true;
            }
        }
        return false; 
    }

    // Tính số lượng CD
    public int soLuongCD() {
        return count;
    }

    // Tính tổng giá thành của các CD
    public double tongGiaThanh() {
        double tong = 0;
        for (int i = 0; i < count; i++) {
            tong += cds[i].getGiaThanh();
        }
        return tong;
    }

    // Tìm CD theo mã
    public CD timCD(int maCD) {
        for (int i = 0; i < count; i++) {
            if (cds[i].getMaCD() == maCD) {
                return cds[i];
            }
        }
        return null; 
    }

    // Sắp xếp danh sách giảm dần theo giá thành
    public void sapXepTheoGia() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (cds[j].getGiaThanh() < cds[j + 1].getGiaThanh()) {
                    CD temp = cds[j];
                    cds[j] = cds[j + 1];
                    cds[j + 1] = temp;
                }
            }
        }
    }


    // Sắp xếp danh sách tăng dần theo tựa CD
    public void sapXepTheoTua() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (cds[j].getTuaCD().compareTo(cds[j + 1].getTuaCD()) > 0) {
                    CD temp = cds[j];
                    cds[j] = cds[j + 1];
                    cds[j + 1] = temp;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(cds[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
