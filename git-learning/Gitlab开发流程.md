# 使用Gitlab开发项目流程  

###### [因为个人知识，能力和经验有限，该开发流程还有许多不足之处，还希望多提建议，共同完善。---石朋超]()  

　　这篇文章是根据我自己对Git及Gitlab学习和理解，写的一篇使用Gitlab管理项目的一个开发流程。
为的是规范开发流程，避免不要的冲突。希望使未使用过Git或新来的员工，只要安装这个开发流程
进行开发，就可以顺利的完成开发。  
>  冲突在开发在开发中是不可避免的，按照此开发流程并不能保证不发生冲突，但一定可以避免不必要的冲突。 

### 管理员
　　首先管理员在Gitlab上建一个Group，为Group添加Members并分配角色，然后新建一个Project，添加readme.md。
默认会有一个master分支，然后新建一个dev分支。
  
　　远程分支：master(设为保护分支)、dev(设为默认分支) 
  
- master分支：保持稳定的、可发布的代码，只有Maintainer可以push，Developer只能发起Merge Requests(合并请求)  

- dev分支：相对稳定的，经过单元测试的代码。Developer和Maintainer都可以push。

>  远程分支可以根据实际项目规划进行调整
### 开发者  
　有新员工加入项目时，应按照如下步骤开发。  

　　1. 新员工登录Gitlab，首先要[**设置自己的SSH Keys**]()  

　　2. 然后找到自己的项目，找到项目的URL，例如：**git@gitlab.test.com:risk/demo.git**，复制URL。  

　　3. 找一个文件夹作为自己的工作目录，鼠标右击，选择**Git Bash Here**  

　　4. 输入**git clone git@gitlab.test.com:risk/demo.git**，克隆远程项目分支到本地，会在当前文件夹建立demo文件夹（和远程项目名称一样）  

　　5. cd demo 进入项目目录，会默认建一个分支为dev(和远程设置的默认分支名相同)  

　　6. **git config user.name "your name"** 配置用户名，**git config user.email "your email"** 配置用户email  

　　7. **git checkout -b mydev** 建立自己本地的开发分支（分支名自定义）  

　　8. 然后在自己的分支上开发 编写代码，**git add 将自己的修改添加到缓存区，git comment -m "message" 提交自己的代码到mydev**分支  

　　9. 当想将自己的代码提交到远程服务器时，首先要**git checkout dev切换到dev分支，git pull**将远程最新的代码拉取到本地[(这一步非常重要，一定要git pull 拉取最新代码)]()  

　　10. 然后切换到**mydev分支，git diff dev 查看mydev分支与dev分支的差异**  

　　11. **git merge dev 将mydev的代码合并到dev分支，如果遇到冲突，需要在自己的mydev分支解决冲突后，再合并代码**  

　　12. 合并成功之后切换到**dev分支，git push 将本地代码提交到远程dev**分支  

> 本地保持一个分支与远程分支关联，用来拉取远程分支代码.<br>
> 本地分支可以根据自己的需要建多个，自己建的分支不向远程推送（如果项目允许，也可以在远程建自己的分支，然后将自己的代码推送到自己的分支上）。

    该流程是使用git命令行写的，使用IDEA或Eclipse开发工具提交管理代码的只需要按照对应的步骤就可以
    
　至此，代码的克隆、编写、提交、推送已经完成。*需要注意分支的切换*  

