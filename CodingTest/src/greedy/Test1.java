/*
 greedy
 �� �ܰ迡�� �� �� �ִ� ������ ��� ã��
 
 -------------------------------------------------------------------
 ���α׷��ӽ� - ü���� - javascript - 5,7,18,20 fail
 function solution(n, lost, reserve) {

    for(var i = 0; i < reserve.length; i++)
    {
        var before = lost.indexOf(reserve[i]-1);
        var same = lost.indexOf(reserve[i]);
        var after = lost.indexOf(reserve[i]+1);
        
        // ���� �� ���� �л��� ��������
        if(same != -1)
        {
            reserve.splice(i,1);
            lost.splice(same,1);
            i--;
            continue;
        }
        
        // �տ� �л� ������
        if(before != -1)
        {
            reserve.splice(i,1);
            lost.splice(before,1);
            i--;
            continue;
        }
        
        // �ڿ� �л� ������
        if(after != -1)
        {
            reserve.splice(i,1);
            lost.splice(after,1);
            i--;
        }
    }
    
   // ��ü - ���� ���� ���ϰ� ������ ���� �л�(������ ü���� 0��)
   return (n - lost.length);
}
------------------------------------------------------------------------------
���α׷��ӽ� - ü���� - javascript - 5 fail
 function solution(n, lost, reserve) {

	reserve.sort();
	lost.sort();
	
    for(var i = 0; i < reserve.length; i++)
    {
        var before = lost.indexOf(reserve[i]-1);
        var same = lost.indexOf(reserve[i]);
        var after = lost.indexOf(reserve[i]+1);
        
        // ���� �� ���� �л��� ��������
        if(same != -1)
        {
            reserve.splice(i,1);
            lost.splice(same,1);
            i--;
            continue;
        }
        
        // �տ� �л� ������
        if(before != -1)
        {
            reserve.splice(i,1);
            lost.splice(before,1);
            i--;
            continue;
        }
        
        // �ڿ� �л� ������
        if(after != -1)
        {
            reserve.splice(i,1);
            lost.splice(after,1);
            i--;
        }
    }
    
   // ��ü - ���� ���� ���ϰ� ������ ���� �л�(������ ü���� 0��)
   return (n - lost.length);
}
 */