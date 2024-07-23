from django.db import models

class Funcionarios(models.Model):
  nome_completo = models.CharField(max_length=100)
  edv = models.CharField(max_length=8)
  cargo = models.CharField(max_length=100)
  setor = models.CharField(max_length=100)
  endereco = models.TextField(unique=True)
  horario_entrada = models.TimeField()
  horario_saida = models.TimeField()
  data_admissao = models.DateField()
  
  def __str__(self):
      return self.nome_completo
