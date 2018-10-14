<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>äº§åç®¡ç</title>
<link rel="stylesheet" type="text/css" href="css/Iframe.css" />
<link rel="stylesheet" href="utilLib/bootstrap.min.css" type="text/css" media="screen" />
<link type="text/css" href="css/zpageNav.css" rel="stylesheet"/>
<script type="text/javascript" src="js/vue.js"></script>
<script type="text/javascript" src="js/vue-resource.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/zpageNav.js"></script>
</head>

<body>
<span class="cp_title">求职者管理</span>
<div id="body">
<div class="add_cp" >
    <input type="text"  placeholder="输入搜索内容"  v-model="search">
	 
</div>
<div class="table_con"  >
	<table>
    	<tr class="tb_title">
        	<td width="10%">ID</td>
            <td width="10%">姓名</td>
            <td width="5%">性别</td>
            <td width="5%">年龄</td>
            <td width="5%">学历</td>
            <td width="15%">电话</td>
            <td width="15%">邮箱</td>
            <td width="10%">状态</td>
            <td width="10%">注册时间</td>
            <td width="15%">操作</td>
        </tr>
        <tr  v-for="item in personList">
        	<td width="10%">{{item.personid}}</td>
            <td width="10%">{{item.username}}</td>
            <td width="5%">{{item.sex}}</td>
            <td width="5%">{{item.age}}</td>
            <td width="5%">
            <span v-if="item.education==0">大专 </span>  
            <span v-if="item.education==1">本科 </span> 
            <span v-if="item.education==2">硕士 </span>  
            <span v-if="item.education==3">博士 </span>   
            <span v-if="item.education==4">其他</span>  
            </td>
            <td width="15%">{{item.tel}}</td>
            <td width="15%">{{item.email}}</td>
            <td width="10%">{{item.status}}</td>
            <td width="10%">{{item.registeredtime}}</td>
            <td width="15%">
            	 <a  @click=" del(item.personid)"  >删除</a>  <a  @click="edit(item.email)">修改</a>  
            </td>
        </tr>
   
          
			                
    </table>
    <!--分页 -->
			<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
				<zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
			</div>
	<!-- 分页结束 -->	
</div>
</div>
</body>
  <script type="text/javascript">

    var DA1vue=new Vue({
        el:'#body',
        data:{
    	 ident:-1,
    	 num:0,
    	 data1:[],
    	 xAxisdata:[],
    	 personList:[],
    	 page:1,
         pageSize:15,
         total:100,
         maxPage:9,
         search:'',
         
        },
        watch:{
        	search:function(value,oldvalue){
        		this.pageHandler(1);
        	}
        	
        
        },
        methods:{
            pageHandler:function(page){
	           this.page=page;
	           var params={"page":page,"row":this.pageSize ,"search":this.search};
	           this.$http.post("getPersonList.do",params,{emulateJSON:true}).then(
	              function(res){
	                this.personList=res.data.list;
	                this.total=res.data.total;
	                this.maxPage=res.data.pages;;
	              },
	              function(res){
	                  console.log(res);
	              } );
			 }, 
			 del:function(personid){
			 	var params={"personid":personid };
	           this.$http.post("delPerson.do",params,{emulateJSON:true}).then(
	              function(res){
	                 
	              },
	              function(res){
	                  console.log(res);
	              } );
			 } , 
                     
             edit:function(email)  {
               window.location.href="editQiuZhi.jsp?email="+email;
             }  
          
             
			 	                
                
          },
         
            created:function(){
            	 this.pageHandler(1);
            	
            }
        });

</script>
</html>
