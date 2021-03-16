<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_                                       _294fb4</name>
   <tag></tag>
   <elementGuidId>2e5ab26a-ea7f-4076-87b9-00ce094a3cba</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='ออกจากระบบ'])[1]/following::div[3]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.card-body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>card-body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

              
               

                    แก้ไขข้อมูล
                    

                    
                        
                            
                                
                           
                                                                                                                                         
                                    
                                        
                                            
                                            
                                        
                                        
                                            
                                            
                                                กรุณาเลือกไฟล์
                                            
                                            กรุณาเลือกไฟล์
                                        
                                    
                                
                            
                        


                        ข้อมูลส่วนตัว
                        
                        
                            
                       
                                
                                    
                                        คำนำหน้า
                                        
                                            นาย 
                                            นาย
                                            นาง
                                            นางสาว
                                        
                                        
                                            กรุณาเลือกคำนำหน้า
                                        
                                    
                                    
                                        เพศ
                                        
                                            ชาย 
                                            ชาย
                                            หญิง
                                            อื่นๆ
                                        
                                        
                                            กรุณาเลือกเพศ
                                        
                                    
                                    
                                        ชื่อ
                                        
                                       
                                    

                                    
                                        นามสกุล
                                        
                                       
                                    

                                    
                                        ชื่อเล่น
                                        
                                       
                                    

                                    
                                        วันเดือนปีเกิด
                                        
                                       
                                    
                                    
                                        เบอร์โทรศัพท์
                                        
                                       
                                    

                                    
                                        Facebook
                                        
                                       
                                    
                                    
                                        Email
                                        
                                       
                                       
                                    
                                   
                        
               
                                    
                            
                                
               
                                      ข้อมูลที่อยู่

                            
                                
                                

                                    
                                        บ้านเลขที่
                                        
                                       
                                    

                                    
                                        ตำบล
                                        
                                       
                                    

                                    
                                        อำเภอเมือง
                                        
                                       
                                    

                                    
                                        จังหวัด
                                        
                                       
                                    
                                    
                                        รหัสไปรษณีย์
                                        
                                       
                                    
                                    
                                          ข้อมูลที่ทำงาน-นักศึกษา
          
                            
                                
                      
                       
 
                                         
                                        หมู่เรียน
                                        
                                            61/100 
                                            61/47
                                            61/100
                                        
                                        
                                    
                                    
                                        ปีที่เข้า
                                        
                                            2544 
                                            2544
  2545
  2546
   2547
    2548
    2549
    2550
    2551
    2552
    2553
    2554
    2555
    2556
    2557
    2558
    2559
    2560
    2561
    2562
    2563
    2564
                                        
                                        
                                    

        
            รหัสนักศึกษา
            
           
        

        
            ที่อยู่ทำงาน
            
           
        

        
            ตำเเหน่ง
            
           
        

        
           
        
        
        
                                    
                        

                        
                        

                                    

                            
                                
                                    ×
                                
                                
                            

                            ยืนยัน
                            ยกเลิก
                        
                    

                
            
        

    
    
    
    
    
    
    
    
    

    

  

    
        function readURL(input) { // ตอนอัพโหลด แสดงให้ขึ้นรูป
            var reader = new FileReader();

            reader.onload = function(e) {
                console.log(e.target.result)
                $('#imgUpload').attr('src', e.target.result).width(140)
            }

            reader.readAsDataURL(input.files[0]);
        }
    

    
        function show_content(id) {
            if (id == 1) {
                document.getElementById(&quot;table_1&quot;).style.display = &quot;&quot;;
                document.getElementById(&quot;table_2&quot;).style.display = &quot;none&quot;;
                document.getElementById(&quot;table_3&quot;).style.display = &quot;none&quot;;
            } else if (id == 2 || id == 3) {
                document.getElementById(&quot;table_1&quot;).style.display = &quot;none&quot;;
                document.getElementById(&quot;table_2&quot;).style.display = &quot;none&quot;;
                document.getElementById(&quot;table_3&quot;).style.display = &quot;none&quot;;
            }
        }
    

    
        function thisFileUpload() {
            document.getElementById(&quot;u_picture&quot;).click();
        };
    



</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;container mt-5 mb-5&quot;]/div[@class=&quot;card p-3&quot;]/div[@class=&quot;card-body&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='ออกจากระบบ'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='ข้อมูลส่วนตัว'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
