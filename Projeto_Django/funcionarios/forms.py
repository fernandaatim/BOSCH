from django import forms
from .models import Funcionarios

class FuncionariosForm(forms.ModelForm):
    class Meta:
        model = Funcionarios
        fields = ['nome_completo', 'edv', 'cargo', 'setor','endereco','horario_entrada','horario_saida','data_admissao']