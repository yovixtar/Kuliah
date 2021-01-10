package pkg1p43;
import javax.swing.*;
import java.util.*;
import java.text.*;
public class Kelompok6 {
    private static String tampil, lapor1,lapor2, menu, nama[], alamat[], kota[], statKawin[], pekerjaan[], noHP[], nasihat1[],nasihat2[],tingkat,kotaIn, statKawinIn, pekerjaanIn;
    private static int noData, noDataView, anak[], gaji[], noRuang, pilihanEdit, hapusElemen, laporan1;
    private static double jarak[],rata_jarak=0,grata_jarak=0,total_jarak=0,gtotal_jarak=0,ggtotal_jarak=0,total_gaji=0,gtotal_gaji=0,ggtotal_gaji=0,rata_gaji=0,grata_gaji=0;
    public static int ktp = 0, kbp = 0, kbb = 0, kpp = 0, ktl = 0, nk = 0, bn = 0, cm = 0, ch = 0, z = 0,gktp = 0, gkbp = 0, gkbb = 0, gkpp = 0, gktl = 0, gnk = 0, gbn = 0, gcm = 0, gch = 0;
    public static int tktp = 0, tkbp = 0, tkbb = 0, tkpp = 0, tktl = 0, tnk = 0, tbn = 0, tcm = 0, tch = 0;
    public static int pns = 0, wira = 0, gd = 0, ll = 0, tp = 0;
    public static int tpns = 0, twira = 0, tgd = 0, tll = 0, ttp = 0;
    public static int gpns = 0, gwira = 0, ggd = 0, gll = 0, gtp = 0;
    public static int ta = 0, tm = 0, tb = 0,tta = 0, ttm = 0, ttb = 0,gta = 0, gtm = 0, gtb = 0;
    private static int h = 0, t_data, jh, x1, x2;
    private static int no, c,tc;
    public static void main(String[] args) {
        DateFormat formatTanggal =new SimpleDateFormat("dd - MMMM - YYYY");
        Date tanggalView =new Date();
        String tampil = "", lagi = "y", konfirmHapus = "y";
        noData = -1;
        noDataView = 0;
        boolean putarMenu = true, cek, hapusLagi;
        nama = new String[15];
        alamat = new String[15];
        kota = new String[15];
        statKawin = new String[15];
        pekerjaan = new String[15];
        noHP = new String[15];
        nasihat1 = new String[15];nasihat2 = new String[15];
        anak = new int[15];
        gaji = new int[15];
        jarak = new double[15];
   do{
        do{
          do{ try{
            menu = JOptionPane.showInputDialog(null, "                 MENU SISTEM WARGA\n"
            + "     PEKALONGAN - KAB. PEKALONGAN\n        KAB. BATANG - KAB. PEMALANG\n                      KOTA YANG LAIN\n\n"
            + "1. INPUT DATA WARGA\n2. EDIT DATA WARGA\n3. HAPUS DATA WARGA"
            + "\n4. LAPORAN UTAMA DATA WARGA\n5. LAPORAN PEKERJAAN WARGA\n6. LAPORAN PENERIMAAN PENDAPATAN"
            + "\n7. LAPORAN SARAN WARGA UNTUK COVID\n8. LAPORAN TINGKAT EKONOMI\n9. EXIT"
            + "\n\n                            PILIH [ 1 - 9 ]");
            cek = false;
            }catch (Exception e){cek = true;JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");}
          }while(cek);
        }while(!("1".equals(menu) | "2".equals(menu) | "3".equals(menu) | "4".equals(menu) | "5".equals(menu) | "6".equals(menu)
                 | "7".equals(menu) | "8".equals(menu) | "9".equals(menu)));
        
  switch(menu){
      case "1":
      if (noData == 14 ){JOptionPane.showMessageDialog(null,"Data Sudah Terisi Penuh");
      }else{
        do {
            noData++;noDataView++;anak[noData] = 0;nasihat2[noData] = "";
            String namaIn = JOptionPane.showInputDialog(null,"Nama Kepala Rumah Tangga :"); nama[noData] = namaIn;
            String alamatIn = JOptionPane.showInputDialog(null,"Alamat :"); alamat[noData] = alamatIn;
            do{
            kotaIn = JOptionPane.showInputDialog("Pilih Kota :\n    [ A ] = Pekalongan\n    [ B ] = Kab. Pekalongan"
                    + "\n    [ C ] = Kab. Batang\n    [ D ] = Kab. Pemalang\n    [ E ] = Kota yang Lain");
            }while (!("A".equals(kotaIn) | "a".equals(kotaIn) | "B".equals(kotaIn) | "b".equals(kotaIn) | 
                    "C".equals(kotaIn) | "c".equals(kotaIn) | "D".equals(kotaIn) | "d".equals(kotaIn) | "E".equals(kotaIn) | "e".equals(kotaIn)));
            if("A".equals(kotaIn) | "a".equals(kotaIn)){kota[noData] = "Pekalongan";}else if("B".equals(kotaIn) | "b".equals(kotaIn)){kota[noData] = "Kab. Pekalongan";}
            else if("C".equals(kotaIn) | "c".equals(kotaIn)){kota[noData] = "Kab. Batang";}else if("D".equals(kotaIn) | "d".equals(kotaIn)){kota[noData] = "Pemalang";}
            else {kota[noData] = "Kota yang Lain";}
            do{
            statKawinIn = JOptionPane.showInputDialog("Pilih Status Perkawinan :\n    [ N ] = Nikah\n    [ B ] = Belum Nikah"
                    + "\n    [ C ] = Cerai Mati\n    [ H ] = Cerai Hidup");
            }while (!("N".equals(statKawinIn) | "n".equals(statKawinIn) | "B".equals(statKawinIn) | "b".equals(statKawinIn) | 
                    "C".equals(statKawinIn) | "c".equals(statKawinIn) | "H".equals(statKawinIn) | "h".equals(statKawinIn)));
            if("N".equals(statKawinIn) | "n".equals(statKawinIn)){statKawin[noData] = "Nikah";}else if("B".equals(statKawinIn) | "b".equals(statKawinIn)){statKawin[noData] = "Belum Nikah";}
            else if("C".equals(statKawinIn) | "c".equals(statKawinIn)){statKawin[noData] = "Cerai Mati";}else {statKawin[noData] = "Cerai Hidup";}
            if("N".equals(statKawinIn)|"n".equals(statKawinIn)|"C".equals(statKawinIn)|"c".equals(statKawinIn)|"H".equals(statKawinIn)|"h".equals(statKawinIn)){
               do{
               try{
                   anak[noData] = Integer.parseInt(JOptionPane.showInputDialog(null,"Jumlah Anak :"));
                   cek = false;
               }catch (Exception e){
                  cek = true;
                  JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");  }
               }while (cek);
            }
            do{
            pekerjaanIn = JOptionPane.showInputDialog("Pilih Pekerjaan :\n    [ 1 ] = PNS\n    [ 2 ] = Guru / Dosen"
                    + "\n    [ 3 ] = TNI / POLRI\n    [ 4 ] = Wirausaha\n    [ 5 ] = Lain - Lain");
            }while (!("1".equals(pekerjaanIn) | "2".equals(pekerjaanIn) | "3".equals(pekerjaanIn) | "4".equals(pekerjaanIn) | "5".equals(pekerjaanIn)));
            if("1".equals(pekerjaanIn)){pekerjaan[noData] = "PNS";}else if("2".equals(pekerjaanIn)){pekerjaan[noData] = "Guru / Dosen";}
            else if("3".equals(pekerjaanIn)){pekerjaan[noData] = "TNI / POLRI";}else if("4".equals(pekerjaanIn)){pekerjaan[noData] = "Wirausaha";}
            else {pekerjaan[noData] = "Lain - Lain";}
            do{
            try{
                gaji[noData] = Integer.parseInt(JOptionPane.showInputDialog(null,"Gaji / Pendapatan :"));
                cek = false;
            }catch (Exception e){
               cek = true;
               JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");  }
            }while (cek);
            do{
            try{
            jarak[noData] = Double.parseDouble(JOptionPane.showInputDialog("Jarak Rumah ke Lokasi Kerja ( KM ) :"));
                cek = false;
            }catch (Exception e){
               cek = true;
               JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");  }
            }while (cek);
            noHP[noData] = JOptionPane.showInputDialog(null,"Nomor Telpon / Hendphone :");
            nasihat1[noData] = JOptionPane.showInputDialog(null,"[ 1 ] Nasihat Tentang Wabah COVID :");
            nasihat2[noData] = JOptionPane.showInputDialog(null,"[ 2 ] Nasihat Tentang Wabah COVID : (Optional)");
            
            tampil += "Nomor Data : "+noDataView+"\n                   DETAIL DATA WARGA"
                   + "\nNama Kepala Rumah Tangga    = "+nama[noData]
                   + "\nAlamat                                             = "+alamat[noData]
                   + "\nKota                                                 = "+kota[noData]
                   + "\nStatus Perkawinan                      = "+statKawin[noData];
            if("N".equals(statKawinIn)|"n".equals(statKawinIn)|"C".equals(statKawinIn)|"c".equals(statKawinIn)|"H".equals(statKawinIn)|"h".equals(statKawinIn)){
                tampil += "\nJumlah Anak                                  = "+anak[noData];
            }
            tampil += "\nPekerjaan                                       = "+pekerjaan[noData]
                   + "\nGaji / Pendapatan                          = Rp "+gaji[noData]
                   + "\nJarak Rumah ke Lokasi Kerja   = "+jarak[noData]+" KM "
                   + "\nNomor Telpon / Handphone        = "+noHP[noData];
            if(!"".equals(nasihat2[noData])){
            tampil += "\nNasihat Tentang Wabah COVID :\n        '' "+nasihat1[noData]+"\n        "+nasihat2[noData]+" ''        ";
            }else{tampil += "\nNasihat Tentang Wabah COVID :\n        '' "+nasihat1[noData]+" ''";}
            JOptionPane.showMessageDialog(null, tampil, "Detail Data Warga", JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            do{
              lagi = JOptionPane.showInputDialog("Input Data Lagi ? [Y / T]");
              if (noData == 14 & ("y".equals(lagi) | "Y".equals(lagi))){JOptionPane.showMessageDialog(null,"Data Sudah Terisi Semua");lagi ="T";}
           }while(!("y".equals(lagi) | "Y".equals(lagi) | "t".equals(lagi) | "T".equals(lagi)));
        }while (("y".equals(lagi)) | ("Y".equals(lagi)));
      }
      break;
          
      case "2":
        do { int dataMax = noData + 1;
        do{
        try{
           do{
           cek = true;
           noRuang = Integer.parseInt(JOptionPane.showInputDialog("Pilih Nomor Ruang [ 1 - "+dataMax+" ]"));
           if (noRuang>=1 & (noRuang<=noData+1)){cek = false;}
           }while (cek);
        cek = false;
        }catch (Exception e){
           JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");
           cek = true;}
        }while (cek);
        do{
        String viewPilihanEdit = "Data Yang Akan Diedit :"
                   + "\n     [ 1 ] = Nama Kepala Rumah Tangga    = "+nama[noRuang-1]
                   + "\n     [ 2 ] = Alamat                                             = "+alamat[noRuang-1]
                   + "\n     [ 3 ] = Kota                                                 = "+kota[noRuang-1]
                   + "\n     [ 4 ] = Status Perkawinan                      = "+statKawin[noRuang-1];
            switch (statKawin[noRuang-1]) {
                case "Nikah":viewPilihanEdit += "\n     [ 5 ] = Jumlah Anak                                  = "+anak[noRuang-1];break;
                case "Cerai Mati":viewPilihanEdit += "\n     [ 5 ] = Jumlah Anak                                  = "+anak[noRuang-1];break;
                case "Cerai Hidup":viewPilihanEdit += "\n     [ 5 ] = Jumlah Anak                                  = "+anak[noRuang-1];break;
            }
            viewPilihanEdit += "\n     [ 6 ] = Pekerjaan                                       = "+pekerjaan[noRuang-1]
                   + "\n     [ 7 ] = Gaji / Pendapatan                          = Rp "+gaji[noRuang-1]
                   + "\n     [ 8 ] = Jarak Rumah ke Lokasi Kerja   = "+jarak[noRuang-1]+" KM "
                   + "\n     [ 9 ] = Nomor Telpon / Handphone        = "+noHP[noRuang-1]
                   + "\n     [ 10 ] = Nasihat Tentang Wabah COVID : (1)\n           '' "+nasihat1[noRuang-1]+" ''"
                   + "\n     [ 11 ] = Nasihat Tentang Wabah COVID : (2)\n           '' "+nasihat2[noRuang-1]+" ''"
                   + "\n     [ 12 ] = Batal Edit";
        try{
            pilihanEdit = Integer.parseInt(JOptionPane.showInputDialog(null,viewPilihanEdit));
            if(pilihanEdit>=1 & pilihanEdit<=12){cek = false;};
        }catch (Exception e){
          cek = true;
          JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");}
        }while(cek);
        
        switch(pilihanEdit){
            case 1 :
            String namaIn = JOptionPane.showInputDialog(null,"Nama Kepala Rumah Tangga :"); nama[noRuang-1] = namaIn;
            break;
            case 2 :
            String alamatIn = JOptionPane.showInputDialog(null,"Alamat :"); alamat[noRuang-1] = alamatIn;
            break;
            case 3 :
            do{
            kotaIn = JOptionPane.showInputDialog("Pilih Kota :\n    [ A ] = Pekalongan\n    [ B ] = Kab. Pekalongan"
                    + "\n    [ C ] = Kab. Batang\n    [ D ] = Kab. Pemalang\n    [ E ] = Kota yang Lain");
            }while (!("A".equals(kotaIn) | "a".equals(kotaIn) | "B".equals(kotaIn) | "b".equals(kotaIn) | 
                    "C".equals(kotaIn) | "c".equals(kotaIn) | "D".equals(kotaIn) | "d".equals(kotaIn) | "E".equals(kotaIn) | "e".equals(kotaIn)));
            if("A".equals(kotaIn) | "a".equals(kotaIn)){kota[noRuang-1] = "Pekalongan";}else if("B".equals(kotaIn) | "b".equals(kotaIn)){kota[noRuang-1] = "Kab. Pekalongan";}
            else if("C".equals(kotaIn) | "c".equals(kotaIn)){kota[noRuang-1] = "Kab. Batang";}else if("D".equals(kotaIn) | "d".equals(kotaIn)){kota[noRuang-1] = "Pemalang";}
            else {kota[noRuang-1] = "Kota yang Lain";}
            break;
            case 4 :
            do{
            statKawinIn = JOptionPane.showInputDialog("Pilih Status Perkawinan :\n    [ N ] = Nikah\n    [ B ] = Belum Nikah"
                    + "\n    [ C ] = Cerai Mati\n    [ H ] = Cerai Hidup");
            }while (!("N".equals(statKawinIn) | "n".equals(statKawinIn) | "B".equals(statKawinIn) | "b".equals(statKawinIn) | 
                    "C".equals(statKawinIn) | "c".equals(statKawinIn) | "H".equals(statKawinIn) | "h".equals(statKawinIn)));
            if("N".equals(statKawinIn) | "n".equals(statKawinIn)){statKawin[noRuang-1] = "Nikah";}else if("B".equals(statKawinIn) | "b".equals(statKawinIn)){statKawin[noRuang-1] = "Belum Nikah";}
            else if("C".equals(statKawinIn) | "c".equals(statKawinIn)){statKawin[noRuang-1] = "Cerai Mati";}else {statKawin[noRuang-1] = "Cerai Hidup";}
            break;
            case 5 :
               do{
               try{
                   anak[noRuang-1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Jumlah Anak :"));
                   cek = false;
               }catch (Exception e){
                  cek = true;
                  JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");  }
               }while (cek);
            break;
            case 6 :
            do{
            pekerjaanIn = JOptionPane.showInputDialog("Pilih Pekerjaan :\n    [ 1 ] = PNS\n    [ 2 ] = Guru / Dosen"
                    + "\n    [ 3 ] = TNI / POLRI\n    [ 4 ] = Wirausaha\n    [ 5 ] = Lain - Lain");
            }while (!("1".equals(pekerjaanIn) | "2".equals(pekerjaanIn) | "3".equals(pekerjaanIn) | "4".equals(pekerjaanIn) | "5".equals(pekerjaanIn)));
            if("1".equals(pekerjaanIn)){pekerjaan[noRuang-1] = "PNS";}else if("2".equals(pekerjaanIn)){pekerjaan[noRuang-1] = "Guru / Dosen";}
            else if("3".equals(pekerjaanIn)){pekerjaan[noRuang-1] = "TNI / POLRI";}else if("4".equals(pekerjaanIn)){pekerjaan[noRuang-1] = "Wirausaha";}
            else {pekerjaan[noRuang-1] = "Lain - Lain";}
            break;
            case 7 :
            do{
            try{
                gaji[noRuang-1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Gaji / Pendapatan :"));
                cek = false;
            }catch (Exception e){
               cek = true;
               JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");  }
            }while (cek);
            break;
            case 8 :
            do{
            try{
            jarak[noRuang-1] = Double.parseDouble(JOptionPane.showInputDialog("Jarak Rumah ke Lokasi Kerja ( KM ) :"));
                cek = false;
            }catch (Exception e){
               cek = true;
               JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");  }
            }while (cek);
            break;
            case 9 :
            noHP[noRuang-1] = JOptionPane.showInputDialog(null,"Nomor Telpon / Hendphone :");
            break;
            case 10 :
            nasihat1[noRuang-1] = JOptionPane.showInputDialog(null,"[ 1 ] Nasihat Tentang Wabah COVID :");
            break;
            case 11 :
            nasihat2[noRuang-1] = JOptionPane.showInputDialog(null,"[ 2 ] Nasihat Tentang Wabah COVID :");
            break;
            case 12: break;
        }

            tampil += "Nomor Data : "+noDataView+"\n                   DETAIL DATA WARGA"
                   + "\nNama Kepala Rumah Tangga    = "+nama[noRuang-1]
                   + "\nAlamat                                             = "+alamat[noRuang-1]
                   + "\nKota                                                 = "+kota[noRuang-1]
                   + "\nStatus Perkawinan                      = "+statKawin[noRuang-1];
            switch (statKawin[noRuang-1]) {
                case "Nikah":tampil += "\nJumlah Anak                                  = "+anak[noRuang-1];break;
                case "Cerai Mati":tampil += "\nJumlah Anak                                  = "+anak[noRuang-1];break;
                case "Cerai Hidup":tampil += "\nJumlah Anak                                  = "+anak[noRuang-1];break;
            }
            tampil += "\nPekerjaan                                       = "+pekerjaan[noRuang-1]
                   + "\nGaji / Pendapatan                          = Rp "+gaji[noRuang-1]
                   + "\nJarak Rumah ke Lokasi Kerja   = "+jarak[noRuang-1]+" KM "
                   + "\nNomor Telpon / Handphone        = "+noHP[noRuang-1];
            if(!"".equals(nasihat2[noRuang-1])){
            tampil += "\nNasihat Tentang Wabah COVID :\n        '' "+nasihat1[noRuang-1]+"\n        "+nasihat2[noRuang-1]+" ''        ";
            }else{tampil += "\nNasihat Tentang Wabah COVID :\n        '' "+nasihat1[noRuang-1]+" ''";}
            JOptionPane.showMessageDialog(null, tampil, "Detail Data Warga", JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            do{
              lagi = JOptionPane.showInputDialog("Edit Data Lagi ? [Y / T]");
           }while(!("y".equals(lagi) | "Y".equals(lagi) | "t".equals(lagi) | "T".equals(lagi)));
        }while (("y".equals(lagi)) | ("Y".equals(lagi)));
        noRuang = 0;
      break;
          
      case "3":
      do {
       int dataMax = noData + 1;
        do{
        try{
           do{
           cek = true;
           noRuang = Integer.parseInt(JOptionPane.showInputDialog("Pilih Nomor Ruang [ 1 - "+dataMax+" ]"));
           if (noRuang>=1 & (noRuang<=noData+1)){cek = false;}
           }while (cek);
        cek = false;
        }catch (Exception e){
           JOptionPane.showMessageDialog(null,"ERROR : Masukan Sesuai Format");
           cek = true;}
        }while (cek);
      do{
        String viewPilihanHapus = "Data Yang Akan Dihapus :"
                   + "\n      Nama Kepala Rumah Tangga    = "+nama[noRuang-1]
                   + "\n      Alamat                                             = "+alamat[noRuang-1]
                   + "\n      Kota                                                 = "+kota[noRuang-1]
                   + "\n      Status Perkawinan                      = "+statKawin[noRuang-1];
            switch (statKawin[noRuang-1]) {
                case "Nikah":viewPilihanHapus += "\n      Jumlah Anak                                  = "+anak[noRuang-1];break;
                case "Cerai Mati":viewPilihanHapus += "\n      Jumlah Anak                                  = "+anak[noRuang-1];break;
                case "Cerai Hidup":viewPilihanHapus += "\n      Jumlah Anak                                  = "+anak[noRuang-1];break;
            }
            viewPilihanHapus += "\n      Pekerjaan                                       = "+pekerjaan[noRuang-1]
                   + "\n      Gaji / Pendapatan                          = Rp "+gaji[noRuang-1]
                   + "\n      Jarak Rumah ke Lokasi Kerja   = "+jarak[noRuang-1]+" KM "
                   + "\n      Nomor Telpon / Handphone        = "+noHP[noRuang-1];
            if(!"".equals(nasihat2[noRuang-1])){
            viewPilihanHapus += "\n      Nasihat Tentang Wabah COVID :\n        '' "+nasihat1[noRuang-1]+"\n        "+nasihat2[noRuang-1]+" ''        ";
            }else{viewPilihanHapus += "\n      Nasihat Tentang Wabah COVID :\n        '' "+nasihat1[noRuang-1]+" ''";}
            viewPilihanHapus += "\n\nYakin Data Akan Dihapus ? [ Y / T ]";
         konfirmHapus = JOptionPane.showInputDialog(null,viewPilihanHapus);
      }while(!("y".equals(konfirmHapus) | "Y".equals(konfirmHapus) | "t".equals(konfirmHapus) | "T".equals(konfirmHapus)));
         if (("y".equals(konfirmHapus) | "Y".equals(konfirmHapus))){
             dataMax--;
             hapusElemen = noRuang - 1;
             if (hapusElemen == noData){ noData--; }
             else if ( hapusElemen<noData){
                 for (int s = hapusElemen; s<=noData;s = s+1){
                     nama[s] = nama[s+1];
                     alamat[s] = alamat[s+1];
                     kota[s] = kota[s+1];
                     statKawin[s] = statKawin[s+1];
                     anak[s] = anak[s+1];
                     pekerjaan[s] = pekerjaan[s+1];
                     gaji[s] = gaji[s+1];
                     jarak[s] = jarak[s+1];
                     noHP[s] = noHP[s+1];
                     nasihat1[s] = nasihat1[s+1];
                     nasihat2[s] = nasihat2[s+1];
                 }
                 noData--;    
             }
         JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!"); 
         }
         else{
            JOptionPane.showMessageDialog(null,"Data Tidak Terhapus!"); 
         }
      if  ( noData == -1){JOptionPane.showMessageDialog(null,"Data Sudah Kosong\n<< Kembali ke Menu");hapusLagi=false;
        }else{
            do{
              lagi = JOptionPane.showInputDialog("Hapus Data Lagi ? [Y / T]");
           }while(!("y".equals(lagi) | "Y".equals(lagi) | "t".equals(lagi) | "T".equals(lagi)));
           if("y".equals(lagi) | "Y".equals(lagi)){hapusLagi=true;}else{hapusLagi=false;}
        }
      }while (hapusLagi);
      break;
                case "4":
                    t_data = noData + 1;
                    h = t_data % 4;
                    if (h == 0) {
                        jh = t_data / 4;
                    } else {
                        jh = (t_data / 4) + 1;
                    }

                    if (jh == 1) {
                        x1 = 0;
                        x2 = noData;
                    } else {
                        x1 = 0;
                        x2 = 3;
                    }
                    no = 0;
                    tktp=0;
                    tkbp=0;
                    tkbb=0;
                    tkpp=0;
                    tktl=0;
                    tnk= 0;
                    tbn= 0;
                    tcm= 0;
                    tch= 0;
                    gktp=0;
                    gkbp=0;
                    gkbb=0;
                    gkpp=0;
                    gktl=0;
                    gnk= 0;
                    gbn= 0;
                    gcm= 0;
                    gch= 0;
                    for (int y = 1; y <= jh; y = y + 1) {
                    ktp = 0;
                    kbp = 0;
                    kbb = 0;
                    kpp = 0;
                    ktl = 0;
                    nk = 0;
                    bn = 0;
                    cm = 0;
                    ch = 0;
                        lapor1 = "";
                        lapor1 += "                                 LAPORAN DATA UTAMA WARGA\n";
                        lapor1 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                                           HAL: " + y + "\n";
                        lapor1 += " -------------------------------------------------------------------------------------------\n";
                        lapor1 += "   NO   NAMA WARGA   ALAMAT     KOTA      STATUS PERKAWINAN\n";
                        lapor1 += " -------------------------------------------------------------------------------------------\n";
                        if (y == jh) {
                            x2 = noData;
                        }
                        for (int z = x1; z <= x2; z = z + 1) {
                            if ("Pekalongan".equalsIgnoreCase(kota[z])) {
                                ktp = ktp + 1;
                            } else if ("Kab. Pekalongan".equalsIgnoreCase(kota[z])) {
                                kbp = kbp + 1;
                            } else if ("Kab. Batang".equalsIgnoreCase(kota[z])) {
                                kbb = kbb + 1;
                            } else if ("Pemalang".equalsIgnoreCase(kota[z])) {
                                kpp = kpp + 1;
                            } else {
                                ktl = ktl + 1;
                            }
                            if ("Nikah".equalsIgnoreCase(statKawin[z])) {
                                nk = nk + 1;
                            } else if ("Belum Nikah".equalsIgnoreCase(statKawin[z])) {
                                bn = bn + 1;
                            } else if ("Cerai Mati".equalsIgnoreCase(statKawin[z])) {
                                cm = cm + 1;
                            } else {
                                ch = ch + 1;
                            }
                            no = no + 1;
                            lapor1 += "    " + no + "   " + nama[z] + "       " + alamat[z] + "         " + kota[z]+ "        " + statKawin[z] + "\n";
                        }
                        lapor1 += " -------------------------------------------------------------------------------------------\n";
                        lapor1 += "  KOTA PEKALONGAN :" + ktp + "                                       NIKAH                :" + nk + "\n";
                        lapor1 += "  KAB PEKALONGAN    :" + kbp + "                                       BELUM NIKAH :" + bn + "\n";
                        lapor1 += "  KAB BATANG               :" + kbb + "                                       CERAI MATI     :" + cm + "\n";
                        lapor1 += "  KOTA PEMALANG      :" + kpp + "                                       CERAI HIDUP   :" + ch + "\n";
                        lapor1 += "  KOTA LAIN                   :" + ktl + "\n";
                        JOptionPane.showMessageDialog(null, lapor1, "LAPORAN DATA UTAMA WARGA",JOptionPane.INFORMATION_MESSAGE);
                        x1 = x1 + 4;
                        x2 = x2 + 4;
                        tktp = tktp+ktp;
                        tkbp = tkbp+kbp;
                        tkbb= tkbb+kbb;
                        tkpp = tkpp+kpp;
                        tktl = tktl+ktl;
                        tnk= tnk+nk;
                        tbn= tbn+bn;
                        tcm= tcm+cm;
                        tch= tch+ch;
                    }
                    gktp = gktp+tktp;
                    gkbp = gkbp+tkbp;
                    gkbb = gkbb+tkbb;
                    gkpp = gkpp+tkpp;
                    gktl = gktl+tktl;
                    gnk= gnk+tnk;
                    gbn= gbn+tbn;
                    gcm= gcm+tcm;
                    gch= gch+tch;
                    lapor2 = "";
                    lapor2 += "  LAPORAN GRAND TOTAL DATA UTAMA WARGA\n";
                    lapor2 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                  HAL: " + (jh+1) + "\n";
                    lapor2 += " ------------------------------------------------------------------\n";
                    lapor2 += "  KOTA PEKALONGAN :" + gktp + "              NIKAH                :" + gnk + "\n";
                    lapor2 += "  KAB PEKALONGAN    :" + gkbp + "              BELUM NIKAH :" + gbn + "\n";
                    lapor2 += "  KAB BATANG               :" + gkbb + "              CERAI MATI     :" + gcm + "\n";
                    lapor2 += "  KOTA PEMALANG      :" + gkpp + "              CERAI HIDUP   :" + gch + "\n";
                    lapor2 += "  KOTA LAIN                   :" + gktl + "\n";
                    lapor2 += " ------------------------------------------------------------------\n";
                        JOptionPane.showMessageDialog(null, lapor2, "LAPORAN GRAND TOTAL DATA UTAMA WARGA",JOptionPane.INFORMATION_MESSAGE);
                    break;
                     case "5":
                    t_data = noData + 1;
                    h = t_data % 4;
                    if (h == 0) {
                        jh = t_data / 4;
                    } else {
                        jh = (t_data / 4) + 1;
                    }

                    if (jh == 1) {
                        x1 = 0;
                        x2 = noData;
                    } else {
                        x1 = 0;
                        x2 = 3;
                    }
                    no = 0;
                    tpns = 0;
                    twira = 0;
                    tgd = 0;
                    tll = 0;
                    ttp = 0;
                    gpns = 0;
                    gwira = 0;
                    ggd = 0;
                    gll = 0;
                    gtp = 0;
                    grata_jarak=0;
                    gtotal_jarak=0;
                    ggtotal_jarak=0;
                    tc=0;
                    for (int y = 1; y <= jh; y = y + 1) {
                    pns = 0;
                    wira = 0;
                    gd = 0;
                    ll = 0;
                    tp = 0;
                    c=0;
                    total_jarak=0;
                    rata_jarak = 0;
                        lapor1 = "";
                        lapor1 += "                                   LAPORAN PEKERJAAN WARGA\n";
                        lapor1 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                                                   HAL: " + y + "\n";
                        lapor1 += " --------------------------------------------------------------------------------------------------\n";
                        lapor1 += "   NO   NAMA WARGA   PEKERJAAN     JARAK TEMPUH KE PEKERJAAN\n";
                        lapor1 += " --------------------------------------------------------------------------------------------------\n";
                        if (y == jh) {
                            x2 = noData;
                        }
                        for (int z = x1; z <= x2; z = z + 1) {
                            if ("PNS".equalsIgnoreCase(pekerjaan[z])) {
                                pns = pns + 1;
                            } else if ("Guru / Dosen".equalsIgnoreCase(pekerjaan[z])) {
                                gd = gd + 1;
                            } else if ("TNI / POLRI".equalsIgnoreCase(pekerjaan[z])) {
                                tp = tp + 1;
                            } else if ("Wirausaha".equalsIgnoreCase(pekerjaan[z])) {
                                wira = wira + 1;
                            } else {
                                ll = ll + 1;
                            }
                            no = no + 1;
                            lapor1 += "    " + no + "   " + nama[z] + "       " + pekerjaan[z] + "         "+ jarak[z] + "\n";
                            c=c+1;
                            total_jarak=total_jarak+jarak[z];
                             if(c<1){
                            rata_jarak=0;
                           }
                          else{
                         rata_jarak = total_jarak / c;
                        }
                        }
                       lapor1 += " --------------------------------------------------------------------------------------------------\n";
                       lapor1 += "  PNS                 =" + pns + "                GURU/DOSEN =" + gd + "                TNI/POLRI      =" + tp + "\n";
                       lapor1 += "  WIRAUSAHA =" + wira + "                LAIN LAIN       =" + ll + "                RATA JARAK =" + rata_jarak + "\n";
                        JOptionPane.showMessageDialog(null, lapor1, "LAPORAN PEKERJAAN WARGA",JOptionPane.INFORMATION_MESSAGE);
                        x1 = x1 + 4;
                        x2 = x2 + 4;
                        tpns = tpns+pns;
                        tgd  = tgd+gd;
                        twira= twira+wira;
                        tll  = tll+ll;
                        ttp  = ttp+tp;
                        gtotal_jarak=gtotal_jarak+total_jarak;
                        tc=tc+c;
                    }
                    gpns= gpns+tpns;
                    ggd= ggd+tgd;
                    gwira= gwira+twira;
                    gll= gll+tll;
                    gtp= gtp+ttp;
                    ggtotal_jarak=ggtotal_jarak+gtotal_jarak;
                    grata_jarak=ggtotal_jarak/tc;
                    lapor2 = "";
                    lapor2 += "                        LAPORAN PEKERJAAN WARGA\n";
                    lapor2 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                                     HAL: " + (jh+1) + "\n";      
                    lapor2 += " --------------------------------------------------------------------------------------\n";
                    lapor2 += "  PNS                 =" + gpns + "           GURU/DOSEN =" + ggd + "           TNI/POLRI      =" + gtp + "\n";
                    lapor2 += "  WIRAUSAHA =" + gwira + "            LAIN LAIN       =" + gll + "\n";
                    lapor2 += " ---------------------------------------------------------------------------------------\n";
                    lapor2 += "  TOTAL KESELURUHAN JARAK =" + ggtotal_jarak + "      RATA RATA JARAK =" + grata_jarak + "\n";
                    lapor1 += " -------------------------------------------------------------------------------------------\n";
                        JOptionPane.showMessageDialog(null, lapor2, "LAPORAN PEKERJAAN WARGA",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    case "6":
                    t_data = noData + 1;
                    h = t_data % 5;
                    if (h == 0) {
                        jh = t_data / 5;
                    } else {
                        jh = (t_data / 5) + 1;
                    }
                    if (jh == 1) {
                        x1 = 0;
                        x2 = noData;
                    } else {
                        x1 = 0;
                        x2 = 4;
                    }
                    no = 0;
                    grata_gaji=0;
                    gtotal_gaji=0;
                    ggtotal_gaji=0;
                    tc=0;
                    for (int y = 1; y <= jh; y = y + 1) {
                        total_gaji=0;
                        rata_gaji = 0;
                        c=0;
                        lapor1 = "";
                        lapor1 += "                 LAPORAN PENERIMAAN PENDAPATAN WARGA\n";
                        lapor1 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                                     HAL: " + y + "\n";
                        lapor1 += " ----------------------------------------------------------------------------------------\n";
                        lapor1 += "   NO   NAMA WARGA   PEKERJAAN    GAJI/PENDAPATAN/BULAN\n";
                        lapor1 += " ----------------------------------------------------------------------------------------\n";
                        if (y == jh) {
                            x2 = noData;
                        }
                        for (int z = x1; z <= x2; z = z + 1) {
                            no = no + 1;
                            lapor1 += "    " + no + "   " + nama[z] + "       " + pekerjaan[z] + "         "+ gaji[z] + "\n";
                            c=c+1;
                            total_gaji=total_gaji+gaji[z];
                            if(c<1){
                            rata_gaji=0;
                            }
                            else{
                            rata_gaji = total_gaji / c;
                            }
                        }
                       lapor1 += " ----------------------------------------------------------------------------------------\n";
                       lapor1 += "  TOTAL PENDAPATAN  =" + total_gaji + "            RATA RATA PENDAPATAN =" + rata_gaji + "\n";
                        JOptionPane.showMessageDialog(null, lapor1, "LAPORAN PENERIMAAN PENDAPATAN WARGA",JOptionPane.INFORMATION_MESSAGE);
                        x1 = x1 + 5;
                        x2 = x2 + 5;
                        gtotal_gaji=gtotal_gaji+total_gaji;
                        tc=tc+c;
                    }
                    ggtotal_gaji=ggtotal_gaji+gtotal_gaji;
                    grata_gaji=ggtotal_gaji/tc;
                    lapor2 = "";
                    lapor2 += "  LAPORAN REKAP PENERIMAAN PENDAPATAN WARGA\n";
                    lapor2 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                  HAL: " + (jh+1) + "\n";      
                    lapor2 += " ---------------------------------------------------------------------------------\n";
                    lapor2 += "  TOTAL KESELURUHAN PENDAPATAN     =" + ggtotal_gaji + "\n";
                    lapor2 += "  RATA RATA PENDPATAN                            =" + grata_gaji + "\n";
                    lapor2 += " ---------------------------------------------------------------------------------\n";
                        JOptionPane.showMessageDialog(null, lapor2, "LAPORAN REKAP PENERIMAAN PENDAPATAN WARGA",JOptionPane.INFORMATION_MESSAGE);
                    break;
                  case "7":
                    t_data = noData + 1;
                    h = t_data % 5;
                    if (h == 0) {
                        jh = t_data / 5;
                    } else {
                        jh = (t_data / 5) + 1;
                    }

                    if (jh == 1) {
                        x1 = 0;
                        x2 = noData;
                    } else {
                        x1 = 0;
                        x2 = 4;
                    }
                    no = 0;
                    for (int y = 1; y <= jh; y = y + 1) {
                        lapor1 = "";
                        lapor1 += "                           LAPORAN SARAN WARGA\n";
                        lapor1 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                  HAL: " + (y) + "\n";
                        lapor1 += " ----------------------------------------------------------------------\n";
                        lapor1 += "   NO   NAMA WARGA               SARAN\n";
                        lapor1 += " ----------------------------------------------------------------------\n";
                        if (y == jh) {
                            x2 = noData;
                        }
                        for (int z = x1; z <= x2; z = z + 1) {
                            no = no + 1;
                            lapor1 += "    " + no + "   " + nama[z] + "       "+ nasihat1[z] + "\n";
                            lapor1 += "                              "+ nasihat2[z] + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lapor1, "LAPORAN SARAN WARGA",JOptionPane.INFORMATION_MESSAGE);
                        x1 = x1 + 5;
                        x2 = x2 + 5; 
                    }
                  break;
                 case "8":
                    t_data = noData + 1;
                    h = t_data % 5;
                    if (h == 0) {
                        jh = t_data / 5;
                    } else {
                        jh = (t_data / 5) + 1;
                    }

                    if (jh == 1) {
                        x1 = 0;
                        x2 = noData;
                    } else {
                        x1 = 0;
                        x2 = 4;
                    }
                    no = 0;
                    tta = 0;
                    ttm = 0;
                    ttb = 0;
                    gta = 0;
                    gtm = 0;
                    gtb = 0;
                    c=0;
                    for (int y = 1; y <= jh; y = y + 1) {
                    ta = 0;
                    tm = 0;
                    tb = 0;
                        lapor1 = "";
                        lapor1 += "                     LAPORAN TINGKAT EKONOMI\n";
                        lapor1 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"                  HAL: " + y + "\n";
                        lapor1 += " ---------------------------------------------------------------------\n";
                        lapor1 += "   NO   NAMA WARGA   TINGKAT EKONOMI\n";
                        lapor1 += " ---------------------------------------------------------------------\n";
                        if (y == jh) {
                            x2 = noData;
                        }
                        for (int z = x1; z <= x2; z = z + 1) {
                              if (gaji[z] <=1000000)
                                {
                                tingkat ="BAWAH";
                                tb=tb+1;
                                }
                              else if (gaji[z] <=7000000)
                                {
                                tingkat ="MENENGAH";
                                tm=tm+1;
                                }
                              else  
                                {
                                tingkat = "ATAS";
                                ta=ta+1;
                                }
                            no = no + 1;
                            lapor1 += "    " + no + "   " + nama[z] + "       " + tingkat + "\n";
                            c=c+1;
                        }
                       lapor1 += " ----------------------------------------------------------------------\n";
                       lapor1 += "  TINGKAT ATAS            =" + ta +"\n";
                       lapor1 += "  TINGKAT MENENGAH =" + tm + "\n";
                       lapor1 += "  TINGKAT BAWAH        =" + tb + "\n";
                        JOptionPane.showMessageDialog(null, lapor1, "LAPORAN TINGKAT EKONOMI",JOptionPane.INFORMATION_MESSAGE);
                        x1 = x1 + 5;
                        x2 = x2 + 5;
                        tta = tta+ta;
                        ttm  = ttm+tm;
                        ttb= ttb+tb;                        
                    }
                    gta= gta+tta;
                    gtm= gtm+ttm;
                    gtb= gtb+ttb;
                    lapor2 = "";
                    lapor2 += "  LAPORAN REKAP TINGKAT EKONOMI\n";
                    lapor2 += "  TANGGAL :"+formatTanggal.format(tanggalView)+"       HAL: " + (jh+1) + "\n";      
                    lapor2 += " ------------------------------------------------------------\n";
                    lapor2 += "  TINGKAT ATAS            =" + gta +"\n";
                    lapor2 += "  TINGKAT MENENGAH =" + gtm + "\n";
                    lapor2 += "  TINGKAT BAWAH        =" + gtb + "\n";
                    lapor2 += " ------------------------------------------------------------\n";
                        JOptionPane.showMessageDialog(null, lapor2, "LAPORAN REKAP TINGKAT EKONOMI",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "9":
                    putarMenu = false;
                    break;
            }
        } while (putarMenu);
        System.exit(0);
    }
}