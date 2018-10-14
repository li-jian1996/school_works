<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<script type="text/javascript" src="js/vue.js"></script>
<script type="text/javascript" src="js/vue-resource.js"></script>
<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>ECharts</title>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="body">
    
    <div id="main" style="height:400px"></div>
    <!-- ECharts单文件引入 -->
    
    <div style="text-align:center">  请输入查询的天数<input type="number"  v-model="num"  min="1"/> </div>
    
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
         
        },
        watch:{
        	num:function(curVal,oldVal){ 
        		console.log(curVal);
        		this.getRecentRegisert(this.num);
        		
        	 },
 
        
        },
        methods:{
                getRecentRegisert:function(num){
                     
                     this.xAxisdata=[];
                     this.xAxisdata.push("1(今天)");
                	 for(var i=2;i<=num ;i++){
                	 	this.xAxisdata.push(i);
                	 }
                	 this.$http.post("getRecentregister.do",   //获取首页投放的公司
                    	{"num":num},{emulateJSON:true}).then(
            			function(res){
            			    this.data1=[];
                			this.data1=res.data ;
                			 ;
                			console.log(res.data);
                			console.log("getRecentRegisert$$#");
                			 this.echart();
                			 
            			},
            			function(res){
            				console.log(res);
            			}
            		);
                
                },
                
                echart:function(){
                     require.config({
							            paths: {
							                echarts: 'http://echarts.baidu.com/build/dist'
							            }
							        });
							        
							        // 使用
							        require(
							            [
							                'echarts',
							                'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
							            ],
							            function (ec) {
							                // 基于准备好的dom，初始化echarts图表
							                var myChart = ec.init(document.getElementById('main')); 
							              option = {
							   
									 title : {
							        text: '近日注册用户',
							               x: 'center',
							        align: 'right'
							    },
									 xAxis: {
							       
										 type: 'category',
							       
										 data: DA1vue.xAxisdata
							  
									  },
							   
									yAxis: {
							        type: 'value'
							    },
							    
									 series: [{
							        data: DA1vue.data1,
							        type: 'line'
							    }]
								
							};
							
							        
							                // 为echarts对象加载数据
							                myChart.resize(); 
							                myChart.setOption(option,true); 
							            }
							        );
							                
							                }
							                
                
          },
         
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
             
            	this.num=7;
            	
            }
        });

</script>

<!--  
    <script type="text/javascript">
        // 路径配置
        require.config({
            paths: {
                echarts: 'http://echarts.baidu.com/build/dist'
            }
        });
        
        // 使用
        require(
            [
                'echarts',
                'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载
            ],
            function (ec) {
                // 基于准备好的dom，初始化echarts图表
                var myChart = ec.init(document.getElementById('main')); 
              option = {
   
		 title : {
        text: '近七日注册用户',
               x: 'center',
        align: 'right'
    },
		 xAxis: {
       
			 type: 'category',
       
			 data: DA1vue.xAxisdata
  
		  },
   
		yAxis: {
        type: 'value'
    },
    
		 series: [{
        data: DA1vue.data1,
        type: 'line'
    }]
	
};

        
                // 为echarts对象加载数据 
                myChart.setOption(option,true); 
            }
        );
    </script>
    -->