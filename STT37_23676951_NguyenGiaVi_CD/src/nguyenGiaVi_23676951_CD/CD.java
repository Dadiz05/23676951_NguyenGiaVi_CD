package nguyenGiaVi_23676951_CD;

public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    // Constructor mặc định
    public CD() {
        this.maCD = 999999;
        this.tuaCD = "chua xac dinh";
        this.soBaiHat = 1;
        this.giaThanh = 1.0;
    }

    // Constructor với tham số
    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        if (maCD <= 0 || soBaiHat <= 0 || giaThanh <= 0) {
            throw new IllegalArgumentException("Ma CD, so bai hat, gia thanh phai > 0");
        }
        this.maCD = maCD;
        this.tuaCD = tuaCD != null ? tuaCD : "chua xac dinh";
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    // Getter và Setter
    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        }
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = (tuaCD != null && !tuaCD.isEmpty()) ? tuaCD : "chua xac dinh";
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        }
    }

    @Override
    public String toString() {
        return String.format("maCD=%d, tuaCD='%s', soBaiHat=%d, giaThanh=%.2f", maCD, tuaCD, soBaiHat, giaThanh);
    }
}
