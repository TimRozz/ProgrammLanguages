import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("                                                   -------------------------------");
            System.out.println("                                                   Введите язык программирования ");
            System.out.println("                                                   Enter the programming language ");
            System.out.println("                                                   -------------------------------");
            String me = scanner.nextLine();
            if(me.equals("Java")){
                System.out.println("----------------------------------");
                System.out.println("public class Main{");
                System.out.println("    public static void main(String[] args){");
                System.out.println("         System.out.println(\"Hello world\");");
                System.out.println("    }");
                System.out.println("}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Python")|| me.equals("python")){
                System.out.println("----------------------------------");
                System.out.println("print(\"Hello world\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("JavaScript")||me.equals("javascript")||me.equals("Javascript")||me.equals("java script") || me.equals("Java script") || me.equals("Java Script")|| me.equals("java Script") || me.equals("Js") || me.equals("JS") || me.equals("js")){
                System.out.println("----------------------------------");
                System.out.println("conole.log(\"Hello world\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("")||me.equals("")){
                System.out.println("----------------------------------");
                System.out.println();
                System.out.println("----------------------------------");
            }
            else if(me.equals("Visual basic")||me.equals("Visual Basic")||me.equals("visual basic")){
                System.out.println("----------------------------------");
                System.out.println("Imports System");
                System.out.println();
                System.out.println("Module Module1");
                System.out.println("   Sub Main()");
                System.out.println("     Console.WriteLine(\"Hello World\")");
                System.out.println("     Console.ReadLine()");
                System.out.println("   End Sub");
                System.out.println("End Module");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Visual Foxpro") ||me.equals("Visual-foxpro")|| me.equals("visual-foxpro")||me.equals("visual Foxpro")||me.equals("visual foxpro")||me.equals("visual fox pro")||me.equals("Visual Fox Pro")||me.equals("Visual fox Pro")||me.equals("Visual-FoxPro")){
                System.out.println("----------------------------------");
                System.out.println("? \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("4th Dimension")||me.equals("4D")){
                System.out.println("----------------------------------");
                System.out.println("ALERT(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ABAP")||me.equals("ABAP4")){
                System.out.println("----------------------------------");
                System.out.println("REPORT NAME.");
                System.out.println();
                System.out.println("WRITE: 'Hello world'.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ABC")){
                System.out.println("----------------------------------");
                System.out.println("WHILE (1=1) :\n" +
                        " WRITE \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ActionScript 2.0")){
                System.out.println("----------------------------------");
                System.out.println("_root.createTextField(\"message\", 0, 5, 5, 300, 50);\n" +
                        "var tf:TextFormat = new TextFormat(); \n" +
                        "tf.color = 0xFF0000;\n" +
                        "tf.size = 32;\n" +
                        "tf.bold = true;\n" +
                        "message.setTextFormat(tf);\n" +
                        "message.text = \"Hello World\"; ");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ActionScript 3.0")){
                System.out.println("----------------------------------");
                System.out.println("var t:TextField=new TextField();\n" +
                        "t.text=\"Hello World\";\n" +
                        "addChild(t);");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Action!")){
                System.out.println("----------------------------------");
                System.out.println("PROC Main()\n" +
                        " PrintE(\"Hello World!\")\n" +
                        "RETURN");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Actionscript (Flash 5)")){
                System.out.println("----------------------------------");
                System.out.println("trace (\"Hello World\");\n");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ActionScript (Flash 8)")){
                System.out.println("----------------------------------");
                System.out.println("class HelloWorld\n" +
                        "{\n" +
                        "    private var helloWorldField:TextField;\n" +
                        " \n" +
                        "    public function HelloWorld( mc:MovieClip )\n" +
                        "    {\n" +
                        "        mc.helloWorldField = mc.createTextField(\"helloWorldField\", mc.getNextHighestDepth(), 0, 0, 100, 100);\n" +
                        "        mc.helloWorldField.autoSize = \"left\";\n" +
                        "\tmc.helloWorldField.html = true;\n" +
                        "        mc.helloWorldField.htmlText = '<font size=\"20\" color=\"#0000FF\">Hello World</font>';\n" +
                        "    }\n" +
                        "}\n" +
                        "import HelloWorld;\n" +
                        "var hw:HelloWorld = new HelloWorld( this );");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Actionscript (Flash MX)")){
                System.out.println("----------------------------------");
                System.out.println("_root.createTextField(\"mytext\",1,100,100,300,100);\n" +
                        "mytext.multiline = true;\n" +
                        "mytext.wordWrap = true;\n" +
                        "mytext.border = false;\n" +
                        "\n" +
                        "myformat = new TextFormat();\n" +
                        "myformat.color = 0xff0000;\n" +
                        "myformat.bullet = false;\n" +
                        "myformat.underline = true;\n" +
                        "\n" +
                        "mytext.text = \"Hello World\";\n" +
                        "mytext.setTextFormat(myformat);");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Ada")){
                System.out.println("----------------------------------");
                System.out.println("with Text_IO;\n" +
                        "procedure Hello_World is\n" +
                        "\n" +
                        "begin\n" +
                        "  Text_IO.Put_Line(\"Hello World\");\n" +
                        "end Hello_World;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Algol-60")){
                System.out.println("----------------------------------");
                System.out.println("'BEGIN'\n" +
                        "    OUTPUT(4,'(''('Hello World')',/')')\n" +
                        "'END'");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Algol-68")){
                System.out.println("----------------------------------");
                System.out.println("( print((\"Hello World\",newline)))");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Alice")){
                System.out.println("----------------------------------");
                System.out.println("\"dlroW olleH\"d&O`@");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Angelscript")){
                System.out.println("----------------------------------");
                System.out.println("void main() { print(\"Hello World\\n\"); }");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Apex")){
                System.out.println("----------------------------------");
                System.out.println("global with sharing class HelloWorld {\n" +
                        "  global static void main() {\n" +
                        "    System.debug('Hello World');\n" +
                        "  }\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("APL")){
                System.out.println("----------------------------------");
                System.out.println("⎕←'Hello World'");
                System.out.println("----------------------------------");
            }
            else if(me.equals("AppleScript")){
                System.out.println("----------------------------------");
                System.out.println("display dialog \"Hello World\"  ");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Arduino")){
                System.out.println("----------------------------------");
                System.out.println("void setup() {\n" +
                        "  Serial.begin(9600);\n" +
                        "  Serial.println(\"Hello World\");\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ASP")){
                System.out.println("----------------------------------");
                System.out.println("<%@ Language= \"VBScript\" %>\n" +
                        "<%\n" +
                        "    Response.Write(\"Hello World\")\n" +
                        "%>");
                System.out.println("----------------------------------");
            }
            else if(me.equals("AspectJ")){
                System.out.println("----------------------------------");
                System.out.println("System.out.println(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("AutoHotkey")){
                System.out.println("----------------------------------");
                System.out.println("MsgBox, Hello World");
                System.out.println("----------------------------------");
            }
            else if(me.equals("AutoIt")){
                System.out.println("----------------------------------");
                System.out.println("MsgBox(0, \"Message Box\", \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("AutoLISP")){
                System.out.println("----------------------------------");
                System.out.println("(alert \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Bash")){
                System.out.println("----------------------------------");
                System.out.println("echo \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("BC")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello world\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("BCPL")){
                System.out.println("----------------------------------");
                System.out.println("GET \"LIBHDR\"\n" +
                        "\n" +
                        "LET START() BE\n" +
                        "$(\n" +
                        "  WRITES(\"Hello World*N\")\n" +
                        "$)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Beta")){
                System.out.println("----------------------------------");
                System.out.println("ORIGIN '~beta/basiclib/betaenv'\n" +
                        "-- program: Descriptor --\n" +
                        "(* Hello World in BETA *)\n" +
                        "(# do 'Hello World' -> putLine #)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Blitz3D")){
                System.out.println("----------------------------------");
                System.out.println(";Blitz3D Hello World demo by MANIAK_dobrii\n" +
                        "Print \"Hello World\"\n" +
                        "WaitKey\n" +
                        "End");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Boo")){
                System.out.println("----------------------------------");
                System.out.println("print \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Broccoli")){
                System.out.println("----------------------------------");
                System.out.println("(out \"Hello World\" crlf)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("C")){
                System.out.println("----------------------------------");
                System.out.println("#include <stdio.h>\n" +
                        "\n" +
                        "int main(void) {\n" +
                        "\tprintf(\"Hello World\\n\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("C Shell")){
                System.out.println("----------------------------------");
                System.out.println("#!/bin/csh\n" +
                        "echo \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("CSharp")||me.equals("C Sharp")){
                System.out.println("----------------------------------");
                System.out.println("System.Console.WriteLine(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("C++")){
                System.out.println("----------------------------------");
                System.out.println("#include <iostream>\n" +
                        "\n" +
                        "int main()\n" +
                        "{\n" +
                        "   std::cout << \"Hello World\" << std::endl;\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("CAML")||me.equals("caml")||me.equals("Caml")){
                System.out.println("----------------------------------");
                System.out.println("print_endline \"Hello World\";;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Ceylon")){
                System.out.println("----------------------------------");
                System.out.println("shared void hello() {\n" +
                        "    print(\"Hello World\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("CIL")||me.equals("Cil")){
                System.out.println("----------------------------------");
                System.out.println("// ilasm cil.il\n" +
                        ".assembly HelloWorld {}\n" +
                        ".method public static void Main() cil managed\n" +
                        "{\n" +
                        "     .entrypoint\n" +
                        "     .maxstack 1\n" +
                        "     ldstr \"Hello World\"\n" +
                        "     call void [mscorlib]System.Console::WriteLine(string)\n" +
                        "     ret\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Clean")||me.equals("clean")){
                System.out.println("----------------------------------");
                System.out.println("module hello\n" +
                        "Start :: {#Char}\n" +
                        "Start = \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Clipper")){
                System.out.println("----------------------------------");
                System.out.println("? \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Clojure")){
                System.out.println("----------------------------------");
                System.out.println("(println \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("CLU")){
                System.out.println("----------------------------------");
                System.out.println("start_up = proc ()\n" +
                        "    po: stream := stream$primary_output ()\n" +
                        "    stream$putl (po, \"Hello World\")\n" +
                        "    end start_up");
                System.out.println("----------------------------------");
            }
            else if(me.equals("COBOL")){
                System.out.println("----------------------------------");
                System.out.println("identification division.\n" +
                        "program-id. cobol.\n" +
                        "procedure division.\n" +
                        "main.\n" +
                        "    display 'Hello World.' end-display.\n" +
                        "    stop run.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Cobra")){
                System.out.println("----------------------------------");
                System.out.println("class Hello\n" +
                        "\n" +
                        "    def main\n" +
                        "        print 'Hello World'");
                System.out.println("----------------------------------");
            }
            else if(me.equals("C#")||me.equals("c#")){
                System.out.println("----------------------------------");
                System.out.println("Class Program\n"+"{\n"+"    static void Main()\n"+"    {\n"+"        Console.writeLine(\"Hello world\");\n"+"    }\n"+"}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("CoffeeScript")){
                System.out.println("----------------------------------");
                System.out.println("alert \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("ColdFusion")){
                System.out.println("----------------------------------");
                System.out.println("<cfset message = \"Hello World\">\n" +
                        "<cfoutput> #message#</cfoutput>");
                System.out.println("----------------------------------");
            }
            else if(me.equals("COMAL")){
                System.out.println("----------------------------------");
                System.out.println("PRINT \"Hello, World!\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Common Lisp")){
                System.out.println("----------------------------------");
                System.out.println("(print \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Coq")){
                System.out.println("----------------------------------");
                System.out.println("Require Import Coq.Lists.List.\n" +
                        "Require Import Io.All.\n" +
                        "Require Import Io.System.All.\n" +
                        "Require Import ListString.All.\n" +
                        "\n" +
                        "Import ListNotations.\n" +
                        "Import C.Notations.\n" +
                        "\n" +
                        "(** The classic Hello World program. *)\n" +
                        "Definition hello_world (argv : list LString.t) : C.t System.effect unit :=\n" +
                        "  System.log (LString.s \"Hello World\").");
                System.out.println("----------------------------------");
            }
            else if(me.equals("D")){
                System.out.println("----------------------------------");
                System.out.println("import std.stdio;\n" +
                        "\n" +
                        "void main()\n" +
                        "{\n" +
                        "\t   writeln(\"Hello World\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Dart")){
                System.out.println("----------------------------------");
                System.out.println("main() {\n" +
                        "  print('Hello World');\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("DCL")){
                System.out.println("----------------------------------");
                System.out.println("WRITE SYS$OUTPUT \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("DCPU")){
                System.out.println("----------------------------------");
                System.out.println("  set i, 0xf615\n" +
                        "  set j, 0x7349\n" +
                        "  hwn z\n" +
                        "  sub z, 1\n" +
                        "\n" +
                        ":device_detect_loop\n" +
                        "  hwq z\n" +
                        "\n" +
                        "  ife a, i\n" +
                        "    ife b, j\n" +
                        "      set pc, device_detect_ret\n" +
                        "\n" +
                        "  sub z, 1\n" +
                        "  ifa z, 0xffff\n" +
                        "    set pc, device_detect_loop\n" +
                        "\n" +
                        ":device_detect_ret\n" +
                        "  set a, 0\n" +
                        "  set b, [vidmem]\n" +
                        "  hwi z\n" +
                        "\n" +
                        "  set i, [vidmem]\n" +
                        "  set j, string\n" +
                        "  set c, 0xc\n" +
                        "\n" +
                        ":memcpy_loop\n" +
                        "  bor [j], 0xf000 ; OR with font style.\n" +
                        "  sti [i], [j]\n" +
                        "  sub c, 1\n" +
                        "  ife c, 0\n" +
                        "    sub pc, 1\n" +
                        "  set pc, memcpy_loop\n" +
                        "\n" +
                        ":display dat 0\n" +
                        ":vidmem dat 0x8000\n" +
                        ":string dat \"Hello World!\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Delphi")){
                System.out.println("----------------------------------");
                System.out.println("// Hello World in Delphi\n" +
                        "Program Hello_World;\n" +
                        "\n" +
                        "($APPTYPE CONSOLE)\n" +
                        "\n" +
                        "Begin\n" +
                        "  WriteLn('Hello World');\n" +
                        "End.");
                System.out.println("----------------------------------");
            }else if(me.equals("Delphi Pascal")){
                System.out.println("----------------------------------");
                System.out.println("program HelloWorld;\n" +
                        "{$APPTYPE CONSOLE}\n" +
                        "\n" +
                        "begin\n" +
                        "\tWriteLn('Hello World');\n" +
                        "end.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Dylan")){
                System.out.println("----------------------------------");
                System.out.println("define method main (#rest args)\n" +
                        "  princ(\"Hello World\");\n" +
                        "end;\n" +
                        "\n" +
                        "main();");
                System.out.println("----------------------------------");
            }
            else if(me.equals("E")){
                System.out.println("----------------------------------");
                System.out.println("println(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("es")){
                System.out.println("----------------------------------");
                System.out.println("echo Hello World");
                System.out.println("----------------------------------");
            }
            else if(me.equals("eC")||me.equals("ec")||me.equals("Ec")){
                System.out.println("----------------------------------");
                System.out.println("class HelloWorldApp : Application\n" +
                        "{\n" +
                        "   void Main()\n" +
                        "   {\n" +
                        "      PrintLn(\"Hello World\");\n" +
                        "   }\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("EGL")||me.equals("Egl")){
                System.out.println("----------------------------------");
                System.out.println("program HelloWorld\n" +
                        "    function main()\n" +
                        "        SysLib.writeStdout(\"Hello World\");\n" +
                        "    end\n" +
                        "end");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Eiffel")){
                System.out.println("----------------------------------");
                System.out.println("indexing \"Hello World in Eiffel\"\n" +
                        "\n" +
                        "class HELLO\n" +
                        "\n" +
                        "creation\n" +
                        "\trun\n" +
                        "\n" +
                        "feature\n" +
                        "\n" +
                        "\trun is\n" +
                        "\t\tlocal\n" +
                        "\t\t\tio : BASIC_IO;\n" +
                        "\t\tdo\n" +
                        "\t\t\t!!io;\n" +
                        "\t\t\tio.put_string(\"Hello World\");\n" +
                        "\t\t\tio.put_newline\n" +
                        "\t\tend; -- run\n" +
                        "end; -- class HELLO");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Elixir")){
                System.out.println("----------------------------------");
                System.out.println(" IO.puts \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Emacs Lisp")||me.equals("EmacsLisp")){
                System.out.println("----------------------------------");
                System.out.println("(message \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Erlang")){
                System.out.println("----------------------------------");
                System.out.println("-module(erlang_hw).\n" +
                        "-export([start/0]).\n" +
                        "\n" +
                        "start() ->\n" +
                        "  io:format(\"Hello World~n\").");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Euphoria")){
                System.out.println("----------------------------------");
                System.out.println("puts(1, \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("F#")){
                System.out.println("----------------------------------");
                System.out.println("printfn \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Factor")){
                System.out.println("----------------------------------");
                System.out.println("USING: io ;\n" +
                        "\"Hello World\" print");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Falcon")){
                System.out.println("----------------------------------");
                System.out.println("#!/usr/bin/env falcon\n" +
                        "\n" +
                        "> \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Fancy")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello World\" println ");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Fantom")){
                System.out.println("----------------------------------");
                System.out.println("// Hello from Fantom!\n" +
                        "class HelloWorld {\n" +
                        "  static Void main() {\n" +
                        "    echo(\"Hello World\")\n" +
                        "  }\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Felix")){
                System.out.println("----------------------------------");
                System.out.println("println$ \"Hello World\";");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Forth")){
                System.out.println("----------------------------------");
                System.out.println(".( Hello World)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Fortran")){
                System.out.println("----------------------------------");
                System.out.println("print *,'Hello World'\n" +
                        "end");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Go")){
                System.out.println("----------------------------------");
                System.out.println("package main\n" +
                        "\n" +
                        "import \"fmt\"\n" +
                        "\n" +
                        "func main() {\n" +
                        "  fmt.Println(\"Hello World\")\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Google AppsScript")|| me.equals("Google Apps Script")){
                System.out.println("----------------------------------");
                System.out.println("function helloWorld() {\n" +
                        "  Logger.log(\"Hello World\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Gosu")){
                System.out.println("----------------------------------");
                System.out.println("print(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Groovy")){
                System.out.println("----------------------------------");
                System.out.println("println \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Haskell")){
                System.out.println("----------------------------------");
                System.out.println("module Main where\n" +
                        "\n" +
                        "main = putStrLn \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Haxe")){
                System.out.println("----------------------------------");
                System.out.println("class HelloWorld {\n" +
                        "    static function main() {\n" +
                        "        trace(\"Hello World\");\n" +
                        "    }\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("HTML")){
                System.out.println("----------------------------------");
                System.out.println("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "  <title>Hello World</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <h1>Hello World</h1>\n" +
                        "</body>\n" +
                        "</html>");
                System.out.println("----------------------------------");
            }
            else if(me.equals("HTTP")){
                System.out.println("----------------------------------");
                System.out.println("import http.server\n" +
                        "import socketserver\n" +
                        "from http import HTTPStatus\n" +
                        "\n" +
                        "\n" +
                        "class Handler(http.server.SimpleHTTPRequestHandler):\n" +
                        "    def do_GET(self):\n" +
                        "        self.send_response(HTTPStatus.OK)\n" +
                        "        self.end_headers()\n" +
                        "        self.wfile.write(b'Hello World')\n" +
                        "\n" +
                        "\n" +
                        "httpd = socketserver.TCPServer(('', 8000), Handler)\n" +
                        "httpd.serve_forever()");
                System.out.println("----------------------------------");
            }
            else if(me.equals("HyperTalk")){
                System.out.println("----------------------------------");
                System.out.println("put \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Icon")){
                System.out.println("----------------------------------");
                System.out.println("procedure main()\n" +
                        "    write(\"Hello World\");\n" +
                        "end");
                System.out.println("----------------------------------");
            }
            else if(me.equals("IDL")){
                System.out.println("----------------------------------");
                System.out.println("print, \"Hello World\"\n" +
                        "end");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Inform")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello World\" by \"I.F. Author\"\n" +
                        "\n" +
                        "The world is a room.\n" +
                        "\n" +
                        "When play begins, say \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Intercal")||me.equals("INTERCAL")){
                System.out.println("----------------------------------");
                System.out.println("DO ,1 <- #13\n" +
                        "PLEASE DO ,1 SUB #1 <- #238\n" +
                        "DO ,1 SUB #2 <- #108\n" +
                        "DO ,1 SUB #3 <- #112\n" +
                        "DO ,1 SUB #4 <- #0\n" +
                        "DO ,1 SUB #5 <- #64\n" +
                        "DO ,1 SUB #6 <- #194\n" +
                        "DO ,1 SUB #7 <- #48\n" +
                        "PLEASE DO ,1 SUB #8 <- #22\n" +
                        "DO ,1 SUB #9 <- #248\n" +
                        "DO ,1 SUB #10 <- #168\n" +
                        "DO ,1 SUB #11 <- #24\n" +
                        "DO ,1 SUB #12 <- #16\n" +
                        "DO ,1 SUB #13 <- #162\n" +
                        "PLEASE READ OUT ,1\n" +
                        "PLEASE GIVE UP");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Io")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello World\\n\" print");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Ioke")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello World\" println");
                System.out.println("----------------------------------");
            }
            else if(me.equals("J")){
                System.out.println("----------------------------------");
                System.out.println("#!/opt/local/bin/jc\n" +
                        "echo 'Hello World'\n" +
                        "exit ''");
                System.out.println("----------------------------------");
            }
            else if(me.equals("J#")){
                System.out.println("----------------------------------");
                System.out.println("package HelloWorld;\n" +
                        "\n" +
                        "public class HelloWorld\n" +
                        "{\n" +
                        "\tpublic static void main(String[] args)\n" +
                        "\t{\n" +
                        "\t\tSystem.Console.Write(\"Hello World\");\n" +
                        "\t}\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Jade")){
                System.out.println("----------------------------------");
                System.out.println("helloWorld();\n" +
                        "\n" +
                        "begin\n" +
                        "   write \"Hello World\";\n" +
                        "end;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("JScript")){
                System.out.println("----------------------------------");
                System.out.println("WScript.Echo(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Julia")){
                System.out.println("----------------------------------");
                System.out.println("println(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Kotlin")){
                System.out.println("----------------------------------");
                System.out.println("fun main() {\n" +
                        "  println(\"Hello World\")\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("LassoScript")){
                System.out.println("----------------------------------");
                System.out.println("<?LassoScript\n" +
                        "\tVariable: 'ScreenText' = 'Hello World';\n" +
                        "\t$ScreenText;\n" +
                        "?>");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Limbo")){
                System.out.println("----------------------------------");
                System.out.println("implement Hello;\n" +
                        "\n" +
                        "include \"sys.m\";\n" +
                        "\tsys: Sys;\n" +
                        "include \"draw.m\";\n" +
                        "\n" +
                        "Hello: module\n" +
                        "{\n" +
                        "\tinit:\tfn(ctxt: ref Draw->Context, argv: list of string);\n" +
                        "};\n" +
                        "\n" +
                        "init(ctxt: ref Draw->Context, argv: list of string)\n" +
                        "{\n" +
                        "\tsys = load Sys Sys->PATH;\n" +
                        "\tsys->print(\"Hello World\\n\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Lingo")){
                System.out.println("----------------------------------");
                System.out.println("on startmovie\n" +
                        "  alert \"Hello World\"\n" +
                        "end");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Lisp")){
                System.out.println("----------------------------------");
                System.out.println("; LISP\n" +
                        "(DEFUN hello ()\n" +
                        "  (PRINT (LIST 'HELLO 'WORLD))\n" +
                        ")\n" +
                        "\n" +
                        "(hello)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Logo")){
                System.out.println("----------------------------------");
                System.out.println("print [Hello World]");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Logtalk")){
                System.out.println("----------------------------------");
                System.out.println("write('Hello World')");
                System.out.println("----------------------------------");
            }
            else if(me.equals("LotusScript")){
                System.out.println("----------------------------------");
                System.out.println("Sub Initialize\n" +
                        "\tPrint \"Hello World\"\n" +
                        "End Sub");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Lua")){
                System.out.println("----------------------------------");
                System.out.println("print(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("M4")){
                System.out.println("----------------------------------");
                System.out.println("Hello");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Magic")){
                System.out.println("----------------------------------");
                System.out.println("HELLO.WORLD\n" +
                        "\n" +
                        "\"Hello World\"^#;\n");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Malbolge")){
                System.out.println("----------------------------------");
                System.out.println("(=<`#9]~6ZY32Vx/4Rs+0No-&Jk)\"Fh}|Bcy?,vNz]KZ%oG4UUS0/@-eMc(:'8");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Maple")){
                System.out.println("----------------------------------");
                System.out.println("printf(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Mathematica")){
                System.out.println("----------------------------------");
                System.out.println("Print[\"Hello World\"]");
                System.out.println("----------------------------------");
            }
            else if(me.equals("MATLAB")){
                System.out.println("----------------------------------");
                System.out.println("disp('Hello World')");
                System.out.println("----------------------------------");
            }
            else if(me.equals("MaxScript")){
                System.out.println("----------------------------------");
                System.out.println("print \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Mel")|| me.equals("MEL")){
                System.out.println("----------------------------------");
                System.out.println("proc helloWorld () {\n" +
                        "   print \"Hello World\\n\";\n" +
                        "}\n" +
                        "helloWorld;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Mercury")){
                System.out.println("----------------------------------");
                System.out.println(":- module hello.\n" +
                        ":- interface.\n" +
                        ":- import_module io.\n" +
                        ":- pred main(io::di, io::uo) is det.\n" +
                        "\n" +
                        ":- implementation.\n" +
                        "main(!IO) :-\n" +
                        "\tio.write_string(\"Hello World\\n\", !IO).");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Modula 2")||me.equals("Modula-2")){
                System.out.println("----------------------------------");
                System.out.println("MODULE HelloWorld;\n" +
                        "\n" +
                        "FROM Terminal2 IMPORT WriteString, WriteLn;\n" +
                        "\n" +
                        "BEGIN\n" +
                        "\n" +
                        "    WriteString(\"Hello World\");\n" +
                        "    WriteLn;\n" +
                        "    \n" +
                        "END HelloWorld.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Modula 3")||me.equals("Modula-3")){
                System.out.println("----------------------------------");
                System.out.println("MODULE HelloWorld;\n" +
                        "IMPORT Io;\n" +
                        "BEGIN\n" +
                        "    IO.Put (\"Hello World\\n\")\n" +
                        "END HelloWorld.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Monkey")){
                System.out.println("----------------------------------");
                System.out.println("puts(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Moo")||me.equals("MOO")){
                System.out.println("----------------------------------");
                System.out.println("@program hello:run\n" +
                        "player:tell(\"Hello World\");\n" +
                        ".");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Mumps")){
                System.out.println("----------------------------------");
                System.out.println(" w \"Hello World\",!");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Nemerle")){
                System.out.println("----------------------------------");
                System.out.println("class Hello\n" +
                        "{\n" +
                        "    static Main () : void\n" +
                        "    {\n" +
                        "        System.Console.WriteLine (\"Hello World\");\n" +
                        "    }\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Nu")){
                System.out.println("----------------------------------");
                System.out.println("(puts \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Oberon")){
                System.out.println("----------------------------------");
                System.out.println("MODULE HelloWorld;\n" +
                        "\n" +
                        "IMPORT Out;\n" +
                        "\n" +
                        "BEGIN\n" +
                        "   Out.Open;\n" +
                        "   Out.String('Hello World');\n" +
                        "END HelloWorld.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Objective C")){
                System.out.println("----------------------------------");
                System.out.println("#import <Foundation/Foundation.h>\n" +
                        "\n" +
                        "int main(void)\n" +
                        "{\n" +
                        "    NSLog(@\"Hello World\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Objective J")){
                System.out.println("----------------------------------");
                System.out.println("document.write(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("OCaml")){
                System.out.println("----------------------------------");
                System.out.println("print_string \"Hello World\\n\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Ooc")){
                System.out.println("----------------------------------");
                System.out.println("main: func {\n" +
                        "    \"Hello World\" println()\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Opa")){
                System.out.println("----------------------------------");
                System.out.println("jlog(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Pascal")){
                System.out.println("----------------------------------");
                System.out.println("program HelloWorld(output);\n" +
                        "begin\n" +
                        "        writeln('Hello World');\n" +
                        "end.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Perl")){
                System.out.println("----------------------------------");
                System.out.println("   #!/usr/local/bin/perl -w\n" +
                        "   use CGI;                             # load CGI routines\n" +
                        "   $q = CGI->new;                        # create new CGI object\n" +
                        "   print $q->header,                    # create the HTTP header\n" +
                        "         $q->start_html('Hello World'), # start the HTML\n" +
                        "         $q->h1('Hello World'),         # level 1 header\n" +
                        "         $q->end_html;                  # end the HTML");
                System.out.println("----------------------------------");
            }
            else if(me.equals("PHP")){
                System.out.println("----------------------------------");
                System.out.println("<?php\n" +
                        "\n" +
                        "echo 'Hello World';");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Pike")){
                System.out.println("----------------------------------");
                System.out.println("int main() {\n" +
                        "    write(\"Hello World\\n\");\n" +
                        "    return 0;\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("PLI")){
                System.out.println("----------------------------------");
                System.out.println("Hello2: proc options(main);\n" +
                        "     put list ('Hello World');\n" +
                        "end Hello2;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("PL/SQL")){
                System.out.println("----------------------------------");
                System.out.println("BEGIN\n" +
                        "  dbms_output.put_line('Hello World');\n" +
                        "END;\n" +
                        "/");
                System.out.println("----------------------------------");
            }
            else if(me.equals("PostScript")){
                System.out.println("----------------------------------");
                System.out.println("% run> gs -q -sDEVICE=nullpage postscript.ps\n" +
                        "(Hello World\\n) print quit");
                System.out.println("----------------------------------");
            }
            else if(me.equals("PowerScript")){
                System.out.println("----------------------------------");
                System.out.println("'Hello World'");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Processing")){
                System.out.println("----------------------------------");
                System.out.println("size(128, 128);\n" +
                        "background(0);\n" +
                        "textAlign(CENTER, CENTER);\n" +
                        "fill(255);\n" +
                        "text(\"Hello World\", width / 2, height / 2);");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Prolog")){
                System.out.println("----------------------------------");
                System.out.println("helloWorld :-\n" +
                        "  write('Hello World').\n" +
                        "\n" +
                        ":- helloWorld.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Pure Data")){
                System.out.println("----------------------------------");
                System.out.println("#N canvas 1029 457 450 300 10;\n" +
                        "#X obj 127 132 print;\n" +
                        "#X msg 127 86 Hello World;\n" +
                        "#X connect 1 0 0 0;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Q")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("R")){
                System.out.println("----------------------------------");
                System.out.println("cat(\"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Racket")){
                System.out.println("----------------------------------");
                System.out.println("#lang racket\n" +
                        "\"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("REALBasic")){
                System.out.println("----------------------------------");
                System.out.println("Function Run(args() as String) As Integer\n" +
                        "  Print \"Hello World\"\n" +
                        "  Quit\n" +
                        "End Function");
                System.out.println("----------------------------------");
            }
            else if(me.equals("REBOL")){
                System.out.println("----------------------------------");
                System.out.println("print \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Rexx")){
                System.out.println("----------------------------------");
                System.out.println("<<hello.rexx>>=\n" +
                        "Say \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("RPG")){
                System.out.println("----------------------------------");
                System.out.println("**free\n" +
                        "dsply 'Hello World';\n" +
                        "return;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Ruby")){
                System.out.println("----------------------------------");
                System.out.println("#!/usr/bin/env ruby\n" +
                        "print \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Rust")){
                System.out.println("----------------------------------");
                System.out.println("fn main() {\n" +
                        "    println!(\"Hello World\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Sas")){
                System.out.println("----------------------------------");
                System.out.println("%macro putit( string= ); \n" +
                        "     %put &string; \n" +
                        "     %mend; \n" +
                        "\n" +
                        "%putit(string=Hello World)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Sather")){
                System.out.println("----------------------------------");
                System.out.println("class MAIN is\n" +
                        "   main is \n" +
                        "      loop \n" +
                        "         #OUT + \"Hello World\\n\" \n" +
                        "      end \n" +
                        "   end\n" +
                        "end");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Scala")){
                System.out.println("----------------------------------");
                System.out.println("object HelloWorld extends App {\n" +
                        "  println(\"Hello World\")\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Scheme")){
                System.out.println("----------------------------------");
                System.out.println("(display \"Hello World\") (newline)");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Sed")){
                System.out.println("----------------------------------");
                System.out.println("#!/usr/bin/sed -f sed.sed\n" +
                        "c\\\n" +
                        "Hello World\n" +
                        "q");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Seed7")){
                System.out.println("----------------------------------");
                System.out.println("$ include \"seed7_05.s7i\";\n" +
                        "\n" +
                        "const proc: main is func\n" +
                        "  begin\n" +
                        "    writeln(\"Hello World\");\n" +
                        "  end func;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Self")){
                System.out.println("----------------------------------");
                System.out.println("'Hello World' printLine");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Shell")){
                System.out.println("----------------------------------");
                System.out.println("#!/bin/sh\n" +
                        "echo \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Simula")){
                System.out.println("----------------------------------");
                System.out.println("Begin\n" +
                        "   OutText (\"Hello World\");\n" +
                        "   Outimage;\n" +
                        "End;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("SmallTalk")){
                System.out.println("----------------------------------");
                System.out.println("Transcript show: 'Hello World'.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("SPSS")){
                System.out.println("----------------------------------");
                System.out.println("BEGIN PROGRAM.\n" +
                        "print \"Hello World\"\n" +
                        "END PROGRAM.");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Squirrel")){
                System.out.println("----------------------------------");
                System.out.println("print(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Standard ML")){
                System.out.println("----------------------------------");
                System.out.println("fun hello() = print(\"Hello World\\n\");\n" +
                        "\n" +
                        "hello()\n");
                System.out.println("----------------------------------");
            }
            else if(me.equals("SuperColider")){
                System.out.println("----------------------------------");
                System.out.println("\"Hello World\".postln;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Tcl")){
                System.out.println("----------------------------------");
                System.out.println("puts \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("TeX")||me.equals("Tex")){
                System.out.println("----------------------------------");
                System.out.println("Hello World\n" +
                        "\\bye");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Turing")){
                System.out.println("----------------------------------");
                System.out.println("put \"Hello World\"");
                System.out.println("----------------------------------");
            }
            else if(me.equals("TypeScript")){
                System.out.println("----------------------------------");
                System.out.println("console.log(\"Hello World\");");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Vala")){
                System.out.println("----------------------------------");
                System.out.println("static void main (string[] args)\n" +
                        "{\n" +
                        "\tstdout.printf (\"Hello World\\n\");\n" +
                        "}");
                System.out.println("----------------------------------");
            }
            else if(me.equals("VB")){
                System.out.println("----------------------------------");
                System.out.println("Module HelloWorld\n" +
                        "    Sub Main()\n" +
                        "        System.Console.WriteLine(\"Hello World\")\n" +
                        "    End Sub\n" +
                        "End Module");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Verilog")){
                System.out.println("----------------------------------");
                System.out.println("module main;\n" +
                        "  initial\n" +
                        "    begin\n" +
                        "      $display(\"Hello World\");\n" +
                        "      $finish;\n" +
                        "    end\n" +
                        "endmodule");
                System.out.println("----------------------------------");
            }
            else if(me.equals("VHDL")){
                System.out.println("----------------------------------");
                System.out.println("use std.textio.all;\n" +
                        "\n" +
                        "entity hello_world is\n" +
                        "end hello_world;\n" +
                        "\n" +
                        "architecture behaviour of hello_world is\n" +
                        "begin\n" +
                        "\tprocess\n" +
                        "    begin\n" +
                        "       write (output, String'(\"Hello World\"));\n" +
                        "       wait;\n" +
                        "    end process;\n" +
                        "end behaviour;");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Visual Basic")){
                System.out.println("----------------------------------");
                System.out.println("Module HelloWorld\n" +
                        "    Sub Main()\n" +
                        "        MsgBox(\"Hello World\")\n" +
                        "    End Sub\n" +
                        "End Module");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Whitespace")){
                System.out.println("----------------------------------");
                System.out.println("   \t  \t   \n" +
                        "\t\n" +
                        "     \t\t  \t \t\n" +
                        "\t\n" +
                        "     \t\t \t\t  \n" +
                        "\t\n" +
                        "     \t\t \t\t  \n" +
                        "\t\n" +
                        "     \t\t \t\t\t\t\n" +
                        "\t\n" +
                        "      \t     \n" +
                        "\t\n" +
                        "     \t \t \t\t\t\n" +
                        "\t\n" +
                        "     \t\t \t\t\t\t\n" +
                        "\t\n" +
                        "     \t\t\t  \t \n" +
                        "\t\n" +
                        "     \t\t \t\t  \n" +
                        "\t\n" +
                        "     \t\t  \t  \n" +
                        "\t\n" +
                        "  ");
                System.out.println("----------------------------------");
            }
            else if(me.equals("XBase")){
                System.out.println("----------------------------------");
                System.out.println("do while .t.\n" +
                        " ? 'Hello World'\n" +
                        "enddo");
                System.out.println("----------------------------------");
            }
            else if(me.equals("XBase++")){
                System.out.println("----------------------------------");
                System.out.println("func Main()\n" +
                        "    Qout(\"Hello World\")\n" +
                        "return 1");
                System.out.println("----------------------------------");
            }
            else if(me.equals("XPL0")){
                System.out.println("----------------------------------");
                System.out.println("code Text=12;\n" +
                        "Text(0, \"Hello World\")");
                System.out.println("----------------------------------");
            }
            else if(me.equals("XQuery")){
                System.out.println("----------------------------------");
                System.out.println("let $hello := \"Hello World\"\n" +
                        "return $hello");
                System.out.println("----------------------------------");
            }
            else if(me.equals("XSLT")){
                System.out.println("----------------------------------");
                System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<xsl:stylesheet version=\"1.0\">\n" +
                        "    <xsl:template match=\"/\">\n" +
                        "        <xsl:text>Hello World</xsl:text>\n" +
                        "    </xsl:template>\n" +
                        "</xsl:stylesheet>");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Yorick")){
                System.out.println("----------------------------------");
                System.out.println("#!/usr/bin/yorick -batch\n" +
                        "print, \"Hello World\";");
                System.out.println("----------------------------------");
            }
            else if(me.equals("Z Shell")){
                System.out.println("----------------------------------");
                System.out.println("#!/bin/zsh\n" +
                        "echo \"Hello World\"");
                System.out.println("----------------------------------");
            }
        }
    }
}