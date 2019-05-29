﻿/* 第一章 Java的入门
 *  资料：清华大学 《java从入门到精通》
 *       《java 编程思想》
 *       《Effective Java》
 *       
 * JAVA  计算机的语言
 * 
 * 语言：人和人之间的沟通方式
 * 计算机语言：人和计算机的 沟通方式
 * 
 * 计算机按照级别分为：
 * 机器语言： 低电位0 和高电位1   0100110 二进制码
 * 汇编语言：助记符  指令  add 2 3
 * 高级语言：编程语言  c,c++ .net  java  python  程序员可以编程的语言
 * 
 * 高级语言分类：按照执行方式分类：
 * 编译执行：源码文件，编译源码文件（底层操作系统），形成二进制文件，机器可以识别二进制文件进行执行。
 *       ： 特点 一次编译多次执行。执行速度相对来说快。
 *       ： 缺点：对于不同操作系统编译出的二进制文件不同，所以可移植性很差。
 *       ：如：c  c++
 *       
 * 解释执行：源码文件，解释执行的语言自带“解释器”（翻译官），将源码翻译成二进制码，机器可以识别执行。
 *       ：特点：每次执行都需要重新“编译、解释”（解释器）执行。
 *       ：缺点：速度相对来慢
 *       ：优点：可移植性好。（源文件）可以放在不同的操作系统上执行。
 *       : 如： python javascript
 *       
 * java 即是解释型的语言也是编译型的语言。
 * java对于源码文件，会编译（jvm虚拟机自己），编译成字节码文件（不是二进制文件）（.class）
 * class文件是可移植的文件（平台无关的）,
 * java的内部的解释器解释执行class文件。
 * 
 * 
 * 
 *一、 java的概述
 *1. java的发展历史
 * 20世纪90年代 单片机计算机系统。小家电的嵌入研发
 * sun公司1991年的时候，专门成立green的项目项目小组研发。
 * 先找一门语言，适合做嵌入式。 c++ （复杂， 庞大、不跨平台）
 * green 先自己开发一门适合做嵌入式的语言。 oak语言
 * 1992年研发成功，没有厂商愿意尝试没有用过的oak。
 * 
 * 94年之后，网络开始逐渐强大web开始兴起。
 * 经过3天的讨论，发现oak语言非常适合做web开发。注册：发现重名，改名：java
 * 
 * 96年适合发布jdk1.0版本
 * ...
 * 06年开始对外开源、免费
 * 09年 oracle收购
 * 10年 主要开发者james从oracle离职
 * 
 * 2014年java8
 *
 *
 *ICQ  中文版的ICQ  OICQ  QQ  
 *
 *
 *
 *2.java的版本
 * jdk的版本1.0---1.9  学习的版本1.8
 * 
 * java技术的版本分为三个：
 * javaSE: java platform standard edition 本课的内容
 * javaEE: 企业版 一系列技术：jsp  Servlet  jdbc  xml  开发框架 Struts2 spring hibernate mybatis
 * javaME: 微型版，手机嵌入式的开发
 *
 *
 *
 *3. java语言的特点
 *（1）跨平台、解释执行
 *（2）面向对象（java是纯面向对象的语言）
 *（3）自动垃圾回收机制
 *（4）鲁棒性
 *（5）支持多线程编程
 *（6）简单性（语法）
 *
 *缺点：不是统一的，要看具体业务。
 *
 *
 *4.java的应用领域
 *桌面程序的开发、游戏
 *嵌入式
 *web系统企业级的开发
 *大数据的开发
 *
 *
 *二、java的开发环境
 *1. jdk的安装
 *注意：开发类型软件，一定要自定义文件夹。
 *jdk是什么：javase development kit 包括：java的运行环境（jre），java的工具 ，java基础的API
 *jre里面包含：jvm+核心类库
 *
 *配置环境变量：
 *概念：操作系统中的特殊信息。每个环境变量有自己的名字。
 * 窗口模式（永久设置）
 * 计算机属性--高级--环境变量
 * 配置java的环境变量：
 * 需要配置两个 JAVA_HOME=指向自己的jdk的文件夹位置  （新建）
 *          PATH= 追加上;
 *          详见：环境变量文档
 * 验证是否配置成功：java          
 *          
 * 有的资料上写了三个：classpath（jdk1.2之后就不用配置）
 * 
 * 
 * 命令行（了解）临时修改
 * 输入set命令，可以看到所有的环境变量
 * 设置：set 环境变量名=环境变量值
 *                  %path%;新环境
 *                  
 *                  
 * 2.开发工具
 * eclipse  免费
 * myeclipse
 * idea                
 *           
 * 三、第一个java程序
 * （1）新建一个.java文件，里面输出“hello world”
 * （2）运行：
 *     分两步：编译：javac  文件名.java
 *           执行：java   类名
 *  一定要保持cmd运行端的路径跟java路径一致。        
 *          
 *  
 *  也可以在eclipse中执行java文件
 *  新建一个project项目：javase
 *  
 *  
 *  java虚拟机的运行原理
 *  java在运行的时候，需要用到两个“器”：编译器、解释型
 *  编译器：将java源文件，编译成java的字节码文件（.class）
 *  解释器：通过解释器将class字节码文件翻译成成对应的命令，机器指令，运行。
 *  
 *  
 *  
 *  四、入门的基础语法
 *  1. 语句块 { } 用于确定代码作用域和提高代码的可读性
 *  2. 每一行以;结束  ，没有缩进的概念
 *  3. 输入和输出
 *  （1）输出 System.out.print(内容)  数值    "字符串"
 *         System.out.println(内容)  数值    "字符串" 自带换行
 *  （2）输入（记住语法）
 *      从控制台，通过键盘进行输入
 *      1. import 导入Scanner
 *      2. Scanner创建对象sc
 *      3. sc.next();  
 *         String h=sc.next()
 *  4. 注释
 *  在一些重要的代码上方加入注释的内容。
 *  注释不经过java的解释器解析。
 *  java中的三种注释：
 *  （1）单行注释    语法：//  从//开始到当前行的末尾   快捷键ctrl+/
 *  （2）多行注释    语法：/*  分行  */ // ctrl+shift+/
/* *（3）文档注释  功能性注释 一般放在文件的最开头，标注创建的日期、作者、功能、方法参数
 *      会可以生成API文档
 *      语法：/**  文档注释内容  
 *          @author 尹达
 *          @version 1.0
 *          */
   /*   生成API文档的命令：
    *  方式一：命令行：javadoc  文件名.java  
    *            如果需要输出作者或者版本信息，需要加-version -author
    *  方式二：使用eclipse
    *        export 注意编码集
*/   

/*  5. 标识符
 * 用来给程序中的类、方法、变量名的符号 
 * 规则：字母、数字、下划线组合，$ ，不能以数字开头
 *      不能是java中的关键字。
 *      不能是java中的直接常量  true  false  null
 *      区分大小写
 *  	中文可以当做 标识符，但是不建议这样做
 *  常用规则：类和接口首字母大写。
 *         变量名和方法名首字母小写，驼峰式    
 *         常量：全部大写
 *  
 *  
 *  五、变量
 *  1. 产生的背景
 *  如果在内存中使用某个数据，如果希望第N次访问，都需要访问他的名字。
 *  直接访问内存的地址会不安全，不方便。
 *  
 *  2. 变量的定义
 *  在程序的运行中，值可以被改变的量，被称为变量。
 *  java中的变量可以看成是存储数据的“盒子”
 *  
 *  
 *  3.变量的组成
 *  变量类型：变量所属的数据类型。
 *  变量名：标识符，对于存储区域起的名字。 名字一旦定义了，就不能被修改了。
 *  变量值：存储的数据
 *  将变量值存储到变量名的区域中。
 *  变量名：房间号
 *  变量值：住在房间的人
 *  对于java来说。
 *  
 *  4. 变量的的声明
 *  类型  变量名  [= 变量值]
 *  变量在声明之后，可以进行初始化，也可以不进行初始化
 *  int a=1;
 *  
 *  一次性声明多个变量：
 *  int a,b=2,c=1,d;  a b c d 都是int类型的变量。
 *  建议，不要一次声明太多。
 *  
 *  
 *  5.变量的内存结构
 *  不同类型的变量存储的位置不同。
 *  在这里，先考虑基本类型的存储
 *  
 *  java中的存储数据的区域：寄存器，栈，堆，静态存储、常量存储区、非随机存储器。。。。
 *  栈：存储速度比较快，缺点就是在栈中的数据大小和生命周期是有明确规定。
 *  堆：动态分配内存，存储速度比较慢生命周期长。
 *  
 *  对于基本数据类型：局部变量：
 *    将基本类型的数据存在栈中。
 *  对于引用类型：栈中存储引用，在堆中存储真正对象
 *  
 *  int a=1,b=2,c=1;
 *  
 *  6. 修改变量
 *  当定义了一个变量之后，可以修改变量中的值，但是，变量的值，必须符合第一次声明的类型
 *  int a=1;
 *  a=2;
 *  a="hello"  错误
 *  
 *  计算机语言：静态语言&动态语言   强类型语言&弱类型语言(了解)
 *  java 强类型静态语言。
 *  静态语言&动态语言：
 *  在声明一个变量的时候，就必须指定变量的类型，之后修改这个变量的时候，只能改成同类型——静态语言。
 *  否则，不需要指定类型，修改这个变量的时候，可以任意修改成其他按类型——动态语言
 *  
 *  强类型语言&弱类型语言:
 *  强类型语言：只要定义了一个变量是某一种类型的数据，除非经历转换，否则一直处于这一种类型
 *  $m=1
 *  $n="abc"
 *  
 *  7.变量的分类和作用域 
 *  从范围的角度：分为局部变量和成员变量
 *  成员变量：声明在类中，作用域是整个类的内部都有效（《类和对象的章节》）
 *  局部变量：声明在语句块中{ } 作用域：从声明的位置开始到最小的语句块结束
 *  	         在相同的作用域下，不能声明两个同名的变量。
 *  
 *  8.java变量的使用原则
 *  java必须先声明后使用，
 *  声明之后，是否需要初始化，取决于使用的环境（成员变量、局部变量）。
 *  
 *  9. 变量赋值给变量
 *  int a=1;
 *  int b=a;
 *  变量本身不能直接赋值给另外一个变量，只能将自己的对象（值）赋值给另外一个变量。
 *  对于基本数据类型来说，相当于将变量值的本身复制一份给另外一个变量。
 *  
 *  
 *  六、常量
 *  特殊的变量叫做常量。不可以改变的量。
 *  
 *  1 普通常量，使用所有字母大写作为名字。
 *  float PI=3.14;
 *  经常使用static final两个关键字来修饰常量
 *  static final float PI=3.14
 *  
 *  
 *  2.特殊的常量
 *  null  true  false  直接常量
 *  null: 代表没有指向任何有效的对象，给引用类型使用的。
 *  int i
 *  Person p;
 *  */






