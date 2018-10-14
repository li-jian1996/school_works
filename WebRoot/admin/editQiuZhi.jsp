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
<script src="js/util.js"></script>
</head>
 <style>
    html, body, h1, form, fieldset, legend, ol ,li{
        padding:0;
        margin:0;
    }
    ol{
        list-style:none;
    }
    body{
        background:#fff;
        color:#4D76B3;
        padding:20px;
    }
    form#payment{
        background:##ACBFDC;
        -webkit-border-radius:5px;
        border-radius:5px;
        padding:20px;
        width:400px;
    }
    form#payment fieldset{
        border:none;
        margin-bottom:10px;
    }
    form#payment fieldset:last-of-type{ margin-bottom:0; }
    form#payment legend{
        color:#4D76B3;
        font-size:16px;
        font-weight:bold;
        padding-bottom:10;
        text-shadow:0px 1px 1px #c0d576;
    }
    form#payment > fieldset>legend:before{
        content:"Step" counter(fieldset)":";
        counter-increment:fieldsets;
    }
    form#payment fieldset fieldset legend{
        color:#111;
        font-size:13px;
        font-weight:normal;
        padding-bottom:0;
    }
    form#payment ol li{
        background:#4D76B3;
        background:rgba(255, 255, 255, 0.3);
        border:#e3ebc3;
        border-color:rgba(255, 255, 255, 0.6);
        border-style:solid;
        border-width:2px;
        -webkit-border-radius:5px;
        line-height:30px;
        padding:5px 10px;
        margin-bottom:2px;
    }
    form#payment ol ol li{
        bakcground:none;
        border:none;
        float:left;
    }
    form#payment label{
        float:left;
        font-size:13px;
        width:110px;
    }
    form#payment fieldset fieldset label{
        background:none no-repeat left 50%;
        line-height:20px;
        padding:0 0 0 30px;
        width:auto;
    }
    form#payment fieldset fieldset label:hover{cursor:pointer;}
    form#payment input:not([type=radio]), form#payment textarea{
        background:#fff;
        border:#fc3 solid 1px;
        -webkit-border-radius:3px;
        outline:none;
        padding:5px;
    }
    </style>
<body>
<h1 align="center">修改信息</h1>	
<hr color="blue"/>       
<!--文本框设置value时，value的值会显示在文本框内-->	
<div  id="body"  style="text-align:center; margin: 0 auto; ">
<a href="javascript:;" onclick="javascript:history.back();">返回到上一页</a>
<form id=payment  style="text-align:center; margin: 0 auto; " >
    <fieldset>
        <legend>用户详细资料</legend>
        <ol>
            <li>
                <label for="name">用户名：</label>
                <input type="text" id="name" name="name" placeholder="请输入用户名" required autofocus   v-model="person.username">
            </li>
            <li>
                <label for="name">性别：</label>
                <input type="text" id="name" name="name" v-model="person.sex"   >
            </li>
             
            
            <li>
                <label for="email">年龄：</label>
                <input type="text" name="email" id="email"  v-model="person.age"  required>
            </li>
            <li>
                
                <label for="email">学历：</label>
                <input type="text" name="email" id="email"  placeholder="0：大专 1：本科 2：硕士 3：博士4: 其他"  v-model="person.education"  required>
                
            </li>
             
            
            <li>
                <label for="email">教育后年份：</label>
                <input type="text" name="email" id="email"  v-model="person.aftereducation" required>
            </li>
            
            <li>
                <label for="phone">联系电话：</label>
                <input type="tel"  id="phone" name="phone" v-model="person.tel" >
            </li>
            <li>
                <label for="phone">邮箱：</label>
                <input type="tel"   id="phone" name="phone" v-model="person.email"   disabled="disabled">
            </li>
            <li>
                <label for="phone">密码：</label>
                <input type="tel"   id="phone" name="phone"  v-model="person.pwd" required>
            </li>
            
        </ol>
    </fieldset>
   
 
    <fieldset>
        <button type="button"  @click="savePerson()">ok</button>
    </fieldset>
</form>
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
    	 person:"",
    	 email:"",
    	  
         search:'',
         
        },
        watch:{
        	 
        	
        
        },
        methods:{
        	savePerson:function(){
        		this.$http.post("savePerson.do",   //fun2
                    	JSON.stringify(this.person),{emulateJSON:true}).then(
            			function(res){
                			 alert("OK");
            			},
            			function(res){
            			    alert("error");
            				console.log(res);
            			}
            	);	
        	}
			 	                
                
        },
         
       created:function(){
            	this.email = decodeURI(getQueryString("email"));
            	this.$http.post("getPersonByEmail.do",   //fun2
                    	{"email":this.email},{emulateJSON:true}).then(
            			function(res){
                			this.person=res.data;
                			Vue.delete(this.person,'registeredtime');
            			},
            			function(res){
            				console.log(res);
            			}
            	);	
        	    	 
        }
        
        });

</script>
</html>
