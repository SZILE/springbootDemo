###SpringMVC

说到SpringMVC，不得不先来谈谈什么是MVC，它和三层架构是什么关系。

>MVC: Model + View + Controller(数据模型+视图+控制器)。<br>
>三层架构：Presentation tier + Application tier + Data tier(展现层+应用层+数据访问层)。

那MVC和三层架构有什么关系呢？<br>
* 实际上MVC只存在三层架构的展现层
<br>M实际上是数据模型，是包含数据的对象。在SpringMVC里，有一个专门的类叫Model，用来和V之间的数据交互、传值；
<br>V指的是视图页面，包含JSP、freeMarker、Velocity、Thymeleaf、Tile等；
<br>C当然就是控制器（SpringMVC的注解@Controller的类）。


