







# 接口

如果是Java 7，那么接口中可以包含的内容有：

​	常量

​	抽象方法

如果是Java 8，还可以额外包含有：

​	默认方法

​	静态方法

如果是Java 9，还可以额外包含有：

​	私有方法



**接口使用步骤：**

1. 接口不能直接使用，必须有一个“实现类”来“实现”该接口。
    格式：
    public class 实现类名称 implements 接口名称 {
   // ...
    }
2. 接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
    实现：去掉abstract关键字，加上方法体大括号。
3. 创建实现类的对象，进行使用。



# Idea常用快捷键

（注：有些操作的快捷键做了更改，和IntelliJ Idea默认的快捷键不一样）

| 动作                           | 快捷键 | 说明 |
| ------------------------------ | ------ | ---- |
| Move Caret to Code Block End   |        |      |
| Move Caret to Code Block Start |        |      |
| Complete Current Statement     |        |      |

动作	快捷键	说明
Move Caret to Code Block End	Ctrl+]	诸如{}围起来的代码块，使用该快捷键可以快速跳转至代码块的结尾处
Move Caret to Code Block Start	Ctrl+[	同上，快速跳至代码块的开始出
Complete Current Statement	Ctrl+Shift+Enter	将输入的if、for、函数等等补上{}或者;使代码语句完整
Start New Line	Shift+Enter	在当前行的下方开始新行
Start New Line Before Current	Ctrl+Alt+Enter	在当前行上方插入新行
Delete to Word End	Ctrl+Delete	删除光标所在至单词结尾处的所有字符
Delete to Word Start	Ctrl+BackSpace	删除光标所在至单词开头的所有字符
Move Caret to Previous Word	Ctrl+向左箭头	将光标移至前一个单词
Move Caret to Next Word	Ctrl+向右箭头	将光标移至后一个单词
Scroll Up	Ctrl+向上箭头	向上滚动一行
Scroll Down	Ctrl+向下箭头	向下滚动一行
Extend Selection	Ctrl+W	选中整个单词
Toggle Case	Ctrl+Shift+U	切换大小写

———————————————Edit——————————————————–
动作	快捷键	说明
Undo	Ctrl+Z	撤销
Redo	Ctrl+Shift+Z	重做
Cut	Ctrl+X	剪切
Copy	Ctrl+C	复制
Paste	Ctrl+V	粘贴
Join Lines	Ctrl+Shift+J	将选中的行合并成一行

—————-Find—————–
动作	快捷键	说明
Find	Ctrl+F	在当前文件中查找
Replace	Ctrl+R	替换字符串
Find in Path	Ctrl+Shift+F	在全局文件中查找字符串
Replace in Path	Ctrl+Shift+R	在全局中替换字符串
Find Usages	Alt+F7	查找当前变量的使用，并列表显示
Show Usages	Ctrl+Alt+F7	查找当前变量的使用，并直接对话框显示
Find Usages in File	Ctrl+F7	在文件中查找符号的使用
Highlight Usages in File	Ctrl+Shift+F7	在文件中高亮显示变量的使用

这里的快捷键用的频率还是很高的，但是之前用的最多的是Ctrl+F和Ctrl+Shift+F，后面相关的Find Usages基本上没有用过，后面应该多使用，有的时候相对Ctrl+F在文件内按字符串查找，还是更好用一些

—————————————–Navigate————————————————
动作	快捷键	说明
Class…	Ctrl+N	查找类文件
File…	Ctrl+Shift+N	查找文件
Line…	Ctrl+G	定位到文件某一行
Back	Alt+向左箭头	返回至上次光标位置
Forward	Alt+向右箭头	返回至后一次光标位置
Last Edit Location	Ctrl+Shift+Backspace	返回上次编辑位置
Next Edit Location	Ctrl+Shift+反斜杠	返回后一次编辑位置
Declaration	Ctrl+B	定位至变量定义的位置
Implementation(s)	Ctrl+Alt+B	定位至选中类或方法的具体实现
Type Declaration	Ctrl+Shift+B	直接定位至光标所在变量的类型定义
Super Method	Ctrl+U	直接定位至当前方法override或者implements的方法定义处
File Structure	Ctrl+F12	显示当前文件的文件结构
File Path	Ctrl+Alt+F12	显示当前文件的路径，并可以方便的将相关父路径打开
Type Hierarchy	Ctrl+H	显示当前类的继承层次
Method Hierarchy	Ctrl+Shift+H	显示当前方法的继承层次
Call Hierarchy	Ctrl+Alt+H	显示当前方法的调用层次
Next Highlighted Error	F2	定位至下一个错误处
Previous Highlighted Error	Shift+F2	定位至前一个错误处
Previous Occurrence	Ctrl+Alt+向上箭头	查找前一个变量共现的地方
Next Occurrence	Ctrl+Alt+向下箭头	查找下一个变量共现的地方

目前还不知道Previous Occurrence 和 Next Occurrence是怎么用的，在变量上使用没有反应。不过在Edit–Find菜单下有几个菜单项：Find Next \/ Move to Next Occurrence、Find Previous \/ Move to Previous Occurrence等。当选中变量的时候，需要首先点击“Find Word at Caret”，然后再点击上述选项才有用

————————————————-Code———————————————–
动作	快捷键	说明
Override Methods…	Ctrl+O	重写基类的方法
Implement Methods…	Ctrl+I	实现基类或接口中的方法
Generate…	Alt+Insert	产生构造方法、getter/setter等方法
Surround With…	Ctrl+Alt+T	将选中的代码使用if、while、try/catch等包装
Unwrap/Remove…	Ctrl+Shift+Delete	去除相关的包装代码

—————————————–Completion——————————————
动作	快捷键	说明
Basic	Alt+/	自动完成
SmartType	Alt+Enter	自动提示完成

—————————————-Folding————————————————-
动作	快捷键	说明
Expand	Ctrl+=	展开代码
Collapse	Ctrl+-	收缩代码
Expand Recursively	Ctrl+Alt+=	递归展开代码
Collapse Recursively	Ctrl+Alt+-	递归收缩代码
Expand All	Ctrl+Shift+=	展开所有代码
Collapse All	Ctrl+Shift+-	收缩所有代码

———————————
动作	快捷键	说明
Insert Live Template	Ctrl+J	插入Live Template
Surround with Live Template	Ctrl+Alt+J	使用Live Template包装
Comment with Line Comment	Ctrl+/	使用//进行注释
Comment with Block Comment	Ctrl+Shift+/	使用/**/进行注释
Reformat Code	Ctrl+Alt+L	格式化代码
Auto-Indent Lines	Ctrl+Alt+I	自动缩进行
Optimize Imports	Ctrl+Alt+O	优化import

———————————
动作	快捷键	说明
Move Statement Down	Ctrl+Shift+向下箭头	将光标所在的代码块向下整体移动
Move Statement Up	Ctrl+Shift+向上箭头	将光标所在的代码块向上移动
Move Element Left	Ctrl+Alt+Shift+向左箭头	将元素向左移动
Move Element Right	Ctrl+Alt+Shift+向右箭头	将元素向右移动
Move Line Down	Alt+Shift+向下箭头	将行向下移动
Move Line Up	Alt+Shift+向上箭头	将行向上移动

————————————-Refactor——————————————–
动作	快捷键	说明
Rename	Shift+F6	重命名
Change Signature	Ctrl+F6	更改函数签名
Type Migration	Ctrl+Shift+F6	更改类型
————————————————
