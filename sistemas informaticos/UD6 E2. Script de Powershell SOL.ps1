# Establim el directori a explorar
$directory = "C:\Users\Davit Martínez\Downloads"

# Obtenim la data de fa 7 dies
$dateLimit = (Get-Date).AddDays(-7)

# Obtenim els arxius amb tamany superior a 2 MB i que hagen sigut accedits en els últims 7 dies
Get-ChildItem -Path $directory -Recurse | 
    Where-Object { 
        $_.Length -gt 2MB -and 
        $_.LastAccessTime -ge $dateLimit
    } | 
    Select-Object Name, Length, LastAccessTime |
    Format-Table -AutoSize

write-host fin del proces