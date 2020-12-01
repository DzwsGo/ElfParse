package com.example.elfparse;

import android.util.Log;

public class Elf32Parse {
    public static ElfHeader parseElfHeader(byte[] bytes) {

        if(bytes == null) {
            Log.e("Elf32Parse","parseElfHeader bytes is null");
            return null;
        }
        ElfHeader elfHeader = new ElfHeader();
        elfHeader.e_ident = Utils.bytes2HexString(Utils.copyBytes(bytes,0,16));
        return elfHeader;
    }
}
