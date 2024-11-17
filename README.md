# **Analysis of Obfuscated Code in Application X**

## **Project Overview**
This project focuses on the analysis and reverse engineering of obfuscated code found in `XApp.apk` (formerly Twitter). The primary objective is to understand the structure and functionality of the application by decompiling and analyzing its components while documenting the obfuscation patterns observed.

---

## **App Details**
- **App Name**: XApp (formerly Twitter)
- **File Type**: APK
- **File Size**: 45 MB
- **Publisher**: X Corp.

---

## **Tools Used**
- **Ghidra**: Reverse engineering and decompilation
- **JADX**: Android APK decompilation
- **APKTool**: APK structure extraction
- **WinRAR**: Initial file extraction

---

## **Process Overview**
1. Extracted APK from the zip file using WinRAR.
2. Decompiled APK to obtain `.dex` files using Ghidra.
3. Converted `.dex` files into `.jar` files using Ghidra and JADX.
4. Extracted `.class` files from the `.jar` using Java decompilers.
5. Decompiled `.class` files to obtain `.java` source files.
6. Conducted a thorough analysis to identify obfuscation patterns.

---

## **Key Findings**
The code in the application shows significant signs of **obfuscation**:
- **Non-descriptive Names**: Classes, methods, and variables have generic, short names such as `a04`, `c04`, `lz3`, and `fn00`.
- **Extensive Anonymous Classes**: Inline anonymous classes like `new oxp()` add complexity and reduce readability.
- **Generic Interfaces**: Examples include `cws<c04, Object, lz3>` with unclear functionality.
- **Custom Annotations**: Annotations such as `@udm` and `@tqm` lack context or documentation.
- **Placeholder Packages**: Package name `defpackage` indicates decompilation or obfuscation.
- **Decompiled Comments**: Comments like `/* compiled from: Twttr */` suggest reverse engineering.
- **Obfuscated Logic**: Abstract and context-free method calls such as `pzg.g()` and `aVar2.c(dzhVarArr, new tz3(a04Var))` obscure the code's intent.

---

## **Visual Documentation**
The repository includes a step-by-step visual breakdown of the decompilation process:
1. **Extracting APK to `.dex`** using Ghidra.
2. **Converting `.dex` to `.jar`** with JADX.
3. **Extracting `.class` files** from `.jar`.
4. **Decompiling `.class` to `.java`** source code.
5. Screenshots highlighting the transitions from one format to another.

---

## **Conclusion**
This project demonstrates the reverse engineering and analysis of obfuscated Android applications. The patterns observed in the code strongly indicate the use of obfuscation to hinder reverse engineering and analysis.

**Note**: This repository is intended for educational and research purposes only.

---
