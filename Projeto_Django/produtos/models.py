from django.db import models

class Produtos(models.Model):
    escolha_tensao=(
        ("110V","110 Volts"),
        ("220V","220 Volts"),
    )
    
    descricao = models.CharField(max_length=200)
    preco = models.DecimalField(max_digits=10, decimal_places=2)
    quantidade = models.CharField(max_length=50,null=True)
    peso = models.DecimalField(max_digits=8, decimal_places=2,null=True)
    tensao = models.CharField(max_length=4, choices=escolha_tensao, blank=False, null=False,default="Escolha uma opção")
    marca = models.CharField(max_length=50)
    tipo = models.CharField(max_length=50,null=True)
    
def __str__(self):
    return self.nome