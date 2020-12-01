package com.example.elfparse;

/**
 * ELF文件头部entity
 */
public class ElfHeader {
    /**
     * struct Elf32_Ehdr {
     * unsigned char e_ident[EI_NIDENT]; // ELF Identification bytes 魔数
     * Elf32_Half    e_type;      // Type of file (see ET_* below) 文件类型
     * Elf32_Half    e_machine;   // Required architecture for this file (see EM_*) 文件架构
     * Elf32_Word    e_version;   // Must be equal to 1 必须是1
     * Elf32_Addr    e_entry;     // Address to jump to in order to start program 入口点地址
     * Elf32_Off     e_phoff;     // Program header table's file offset, in bytes 程序头偏移量（大小）
     * Elf32_Off     e_shoff;     // Section header table's file offset, in bytes 节头偏移量（大小）
     * Elf32_Word    e_flags;     // Processor-specific flags 标志
     * Elf32_Half    e_ehsize;    // Size of ELF header, in bytes Elf头部大小
     * Elf32_Half    e_phentsize; // Size of an entry in the program header table 程序头大小
     * Elf32_Half    e_phnum;     // Number of entries in the program header table 程序头数量
     * Elf32_Half    e_shentsize; // Size of an entry in the section header table 节头大小
     * Elf32_Half    e_shnum;     // Number of entries in the section header table 节头数量
     * Elf32_Half    e_shstrndx;  // Sect hdr table index of sect name string table 字符串表索引节头
     * bool checkMagic() const {
     *   return (memcmp(e_ident, ElfMagic, strlen(ElfMagic))) == 0;
     * }
     * unsigned char getFileClass() const { return e_ident[EI_CLASS]; }
     *   unsigned char getDataEncoding() const { return e_ident[EI_DATA]; }
     * };
     *
     */
    public String e_ident,e_type,machine,version,e_entry,e_phoff,e_shoff,e_flags,e_ehsize,e_phentsize,e_phnum,e_shentsize,e_shnum,e_shstrndx;

    @Override
    public String toString() {
        return "ElfHeader{" +
                "e_ident='" + e_ident + '\'' +
                ", e_type='" + e_type + '\'' +
                ", machine='" + machine + '\'' +
                ", version='" + version + '\'' +
                ", e_entry='" + e_entry + '\'' +
                ", e_phoff='" + e_phoff + '\'' +
                ", e_shoff='" + e_shoff + '\'' +
                ", e_flags='" + e_flags + '\'' +
                ", e_ehsize='" + e_ehsize + '\'' +
                ", e_phentsize='" + e_phentsize + '\'' +
                ", e_phnum='" + e_phnum + '\'' +
                ", e_shentsize='" + e_shentsize + '\'' +
                ", e_shnum='" + e_shnum + '\'' +
                ", e_shstrndx='" + e_shstrndx + '\'' +
                '}';
    }
}
