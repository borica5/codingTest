/*
 greedy
 그 단계에서 고를 수 있는 최적의 경로 찾기
 
 -------------------------------------------------------------------
 프로그래머스 - 체육복 - javascript - 5,7,18,20 fail
 function solution(n, lost, reserve) {

    for(var i = 0; i < reserve.length; i++)
    {
        var before = lost.indexOf(reserve[i]-1);
        var same = lost.indexOf(reserve[i]);
        var after = lost.indexOf(reserve[i]+1);
        
        // 여벌 옷 가진 학생이 도난당함
        if(same != -1)
        {
            reserve.splice(i,1);
            lost.splice(same,1);
            i--;
            continue;
        }
        
        // 앞에 학생 빌려줌
        if(before != -1)
        {
            reserve.splice(i,1);
            lost.splice(before,1);
            i--;
            continue;
        }
        
        // 뒤에 학생 빌려줌
        if(after != -1)
        {
            reserve.splice(i,1);
            lost.splice(after,1);
            i--;
        }
    }
    
   // 전체 - 실제 도난 당하고 빌리지 못한 학생(수중의 체육복 0벌)
   return (n - lost.length);
}
------------------------------------------------------------------------------
프로그래머스 - 체육복 - javascript - 5 fail
 function solution(n, lost, reserve) {

	reserve.sort();
	lost.sort();
	
    for(var i = 0; i < reserve.length; i++)
    {
        var before = lost.indexOf(reserve[i]-1);
        var same = lost.indexOf(reserve[i]);
        var after = lost.indexOf(reserve[i]+1);
        
        // 여벌 옷 가진 학생이 도난당함
        if(same != -1)
        {
            reserve.splice(i,1);
            lost.splice(same,1);
            i--;
            continue;
        }
        
        // 앞에 학생 빌려줌
        if(before != -1)
        {
            reserve.splice(i,1);
            lost.splice(before,1);
            i--;
            continue;
        }
        
        // 뒤에 학생 빌려줌
        if(after != -1)
        {
            reserve.splice(i,1);
            lost.splice(after,1);
            i--;
        }
    }
    
   // 전체 - 실제 도난 당하고 빌리지 못한 학생(수중의 체육복 0벌)
   return (n - lost.length);
}
 */