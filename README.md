# Program4
java实验4
## 阅读程序
## 一、实验目的 
1、 掌握字符串String及其方法的使用 
2、 掌握文件的读取/写入方法；
3、 掌握异常处理结构 。
## 二、实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。 
文件A包括两部分内容： 一是学生的基本信息； 二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法；
--实现如下功能：  
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2、允许提供输入参数，统计古诗中某个字或词出现的次数
3、输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
4、考虑操作中可能出现的异常，在程序中设计异常处理程序 
--附加要求： 
1、设计学生类； 
2、采用交互式方式实例化某学生； 
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。 
## 三、核心代码
## 四、运行结果
## 五、实验感想
通过本次实验，我掌握了字符串String及其方法的使用以及文件的读取/写入方法 ，在整理古诗时遇到了转义符“\n”无法换行的问题，后采用了String line = System.getProperty("line.separator");方法，成功实现了换行功能。
