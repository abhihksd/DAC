i=2
while [ $i -le 100 ]
do
	flag=0
	j=2
	while [ $j -lt $i ]
	do
		if [ $((i%j)) -eq 0 ]
		then
			flag=1
		fi
		j=$((j+1))
	done
	if [ $flag -eq 0 ]
	then
		echo $i
	fi
	i=$((i+1))
done
	
