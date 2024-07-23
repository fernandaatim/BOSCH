from django import forms
from .models import Produtos

class ProdutosForms(forms.ModelForm):
    class Meta:
        model = Produtos
        fields = ['descricao','preco','quantidade','peso','tensao','marca','tipo']