# ibps-simu-source
a simu tools for  ibps system




# 前端注意
nodejs > 16.18.0 && pnpm > 8.6.0 (强制使用pnpm)


参考	https://gitee.com/kailong110120130/vue-element-plus-admin

改换 saas，自动引入等功能


最新技术栈：使用 Vue3、Vite4 等前端前沿技术开发
TypeScript: 应用程序级 JavaScript 的语言
主题: 可配置的主题
国际化：内置完善的国际化方案
权限：内置完善的动态路由权限生成方案
组件：二次封装了多个常用的组件
示例：内置丰富的示例



技术栈
框架	说明	版本
Vue	Vue 框架	3.3.8
Vite	开发与构建工具	4.5.0
Element Plus	Element Plus	2.4.2
TypeScript	JavaScript 的超集	5.2.2
pinia	Vue 存储库 替代 vuex5	2.1.7
vueuse	常用工具集	10.6.1
vue-i18n	国际化	9.6.5
vue-router	Vue 路由	4.2.5
unocss	原子 css	0.57.4
iconify	在线图标库	3.1.1
wangeditor	富文本编辑器	5.1.23



开发工具
推荐 VS Code 开发，配合插件如下：

插件名	功能
TypeScript Vue Plugin (Volar)	用于 TypeScript 的 Vue 插件			 此扩展已弃用。请改用 Vue - Official扩展
Vue Language Features (Volar)	Vue3.0 语法支持
unocss							unocss for vscode
Iconify IntelliSense	Iconify 预览和搜索
i18n Ally	国际化智能提示
Stylelint	Css 格式化
Prettier - Code formatter	代码格式化
ESLint	脚本代码检查
DotENV	env 文件高亮


内置功能
系统内置多种多种业务功能，可以用于快速你的业务系统：

系统功能
基础设施
工作流程
支付系统
会员中心
数据报表
商城系统
微信公众号
ERP 系统
CRM 系统
系统功能
功能	描述
用户管理	用户是系统操作者，该功能主要完成系统用户配置
⭐️	在线用户	当前系统中活跃用户状态监控，支持手动踢下线
角色管理	角色菜单权限分配、设置角色按机构进行数据范围权限划分
菜单管理	配置系统菜单、操作权限、按钮权限标识等，本地缓存提供性能
部门管理	配置系统组织机构（公司、部门、小组），树结构展现支持数据权限
岗位管理	配置系统用户所属担任职务
🚀	租户管理	配置系统租户，支持 SaaS 场景下的多租户功能
🚀	租户套餐	配置租户套餐，自定每个租户的菜单、操作、按钮的权限
字典管理	对系统中经常使用的一些较为固定的数据进行维护
🚀	短信管理	短信渠道、短息模板、短信日志，对接阿里云、腾讯云等主流短信平台
🚀	邮件管理	邮箱账号、邮件模版、邮件发送日志，支持所有邮件平台
🚀	站内信	系统内的消息通知，提供站内信模版、站内信消息
🚀	操作日志	系统正常操作日志记录和查询，集成 Swagger 生成日志内容
⭐️	登录日志	系统登录日志记录查询，包含登录异常
🚀	错误码管理	系统所有错误码的管理，可在线修改错误提示，无需重启服务
通知公告	系统通知公告信息发布维护
🚀	敏感词	配置系统敏感词，支持标签分组
🚀	应用管理	管理 SSO 单点登录的应用，支持多种 OAuth2 授权方式
🚀	地区管理	展示省份、城市、区镇等城市信息，支持 IP 对应城市