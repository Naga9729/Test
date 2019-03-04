
//  javascript closures


let a,b,c;
a=100;
c=a;
a=200;

function doTeach(sub,trainer){
    console.log('-- teaching '+sub+' by '+trainer);
   abc= function(task){
        console.log('doing '+task+' task given by '+trainer);  
    }
    return abc;
    //doTask('Collections API')
}
var t1=doTeach('java','praveen');
t1('Threads')
t1('COlections');

var t2=doTeach('java script','james');
t2('data types');


