# 互联网求职招聘网站系统 V1.0

基于 B/S 架构的在线招聘平台，面向**求职者**、**招聘企业**与**系统管理员**三类用户，提供职位分类浏览、关键字与多条件搜索、职位详情查看、个人简历维护、在线简历投递、企业职位发布与应聘管理、后台用户管理等完整的招聘业务功能。

## 功能特性

### 求职者端
- 注册 / 登录（图形验证码 + 加盐 MD5 密码加密）
- 职位三级分类浏览（行业 → 类别 → 具体职位）
- 关键字、城市、行业、薪资等多条件组合搜索，分页展示
- 职位详情查看（职位描述、薪资范围、任职要求等）
- 在线投递简历、投递记录查询
- 个人简历维护：基本信息、简历信息、项目经历、工作经历
- 收藏职位、订阅职位、账号绑定、修改密码

### 招聘企业端
- 企业注册 / 登录
- 企业资料维护（公司简介、Logo、网站、产品信息、创始人等）
- 职位发布 / 编辑 / 下架 / 删除
- 应聘简历管理：查看投递简历、筛选、面试邀请、拒绝处理

### 后台管理端
- 求职者 / 招聘企业用户列表管理
- 用户删除、注册数据统计
- 职位与分类管理

## 技术栈

| 层次 | 技术 |
|---|---|
| 前端 | JSP / JSTL、Vue.js、jQuery、Bootstrap、ECharts |
| 控制层 | Spring MVC（`*.do` 请求映射） |
| 业务层 | Spring（依赖注入 + AOP 声明式事务） |
| 数据访问层 | MyBatis + PageHelper 分页插件 |
| 数据库 | MySQL 5.7，C3P0 连接池 |
| 其他 | Jackson（JSON）、log4j（日志）、图形验证码 |

## 运行环境

- 操作系统：Windows 7 / Windows 10 / Linux
- JDK 1.8
- Apache Tomcat 8
- MySQL 5.7
- 浏览器：Chrome / Firefox / Edge 等现代浏览器

## 项目结构

```
源码_清理版/
├── src/                          # Java 源码
│   ├── applicationContext.xml    # Spring 配置（数据源、事务、Mapper 扫描）
│   ├── springmvc.xml             # Spring MVC 配置
│   ├── SqlMapConfig.xml          # MyBatis 配置
│   ├── db.properties             # 数据库连接配置
│   ├── log4j.properties          # 日志配置
│   └── cn/edu/hbpu/recruitment/
│       ├── controller/           # 控制层（Front/Back/Admin/VerifyCodeServlet）
│       ├── service/impl/         # 业务层接口与实现
│       ├── mapper/               # MyBatis Mapper 接口与 XML
│       ├── pojo/                 # 实体类与查询条件类（含 Example）
│       └── util/                 # 工具类（SaltMD5/VerifyCode/拦截器/异常处理）
├── WebRoot/                      # Web 根目录
│   ├── index.jsp                 # 前台首页（欢迎页）
│   ├── *.jsp                     # 前台页面（登录/注册/职位列表/简历/投递等）
│   ├── admin/                    # 后台管理页面
│   ├── style/                    # 前台静态资源（css/js/images）
│   └── WEB-INF/
│       ├── web.xml               # Web 应用部署描述
│       └── classes/              # 编译产物与资源配置
├── database/
│   └── recruitment.sql           # 数据库初始化脚本（11 张表）
└── test/                         # 测试代码
```

## 数据库设计

数据库名 `recruitment`，共 11 张表：

| 表名 | 说明 |
|---|---|
| `admin` | 管理员账号 |
| `person` | 求职者（个人信息） |
| `company` | 招聘企业（企业资料、产品、CEO 信息） |
| `job` | 职位（工作性质、学历要求、薪资、状态） |
| `jobc1` / `jobc2` / `jobc3` | 职位三级分类（行业/类别/职位） |
| `person_job` | 求职者-职位投递关系 |
| `resumeinformation` | 简历信息 |
| `projectexperience` | 项目经历 |
| `workexperience` | 工作经历 |

## 部署步骤

1. **准备环境**：安装 JDK 1.8、Tomcat 8、MySQL 5.7。
2. **初始化数据库**：
   ```sql
   mysql -u root -p < database/recruitment.sql
   ```
3. **修改数据库连接**：编辑 `src/db.properties`：
   ```properties
   jdbc.driverClassName=com.mysql.jdbc.Driver
   jdbc.url=jdbc:mysql://localhost:3306/recruitment?characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useAffectedRows=true
   jdbc.username=root
   jdbc.password=123456
   ```
   按本机实际用户名 / 密码修改。
4. **导入项目**：使用 Eclipse / IDEA 导入 `源码_清理版` 目录（Web 项目，WebRoot 为 Web 根目录）。
5. **添加依赖**：引入 Spring、Spring MVC、MyBatis、C3P0、Jackson、log4j、PageHelper 等 jar 包（项目未内置 lib 目录，需自行添加，或使用 Maven 按配置重建）。
6. **部署启动**：将项目部署到 Tomcat 8 并启动，浏览器访问：
   ```
   http://localhost:8080/源码_清理版/
   ```
   默认欢迎页为 `index.jsp`；后台管理入口为 `/admin/`。

## 说明

- 本项目为软件著作权登记配套源码（"互联网求职招聘网站系统 V1.0"），目录 `源码_清理版` 为清理后的可提交版本。
- 请求统一以 `*.do` 后缀映射到 Spring MVC 控制器。
- 密码使用邮箱作为盐进行加盐 MD5 加密（`util/SaltMD5`）。
- 后台登录由 `LoginInterceptor` 拦截校验；全局异常由 `CustomExceptionResolver` 统一处理。
- 更多设计细节见同目录文档：`程序设计说明书`、`用户手册`、`操作说明书`。
